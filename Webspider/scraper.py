from bs4 import BeautifulSoup
import requests
import re
import logging
import json

class Movie(object):
    name = ""
    year = 0
    gross = 0
    actors = []
    
logging.basicConfig(filename='WebScraper.log',level=logging.DEBUG)

#lists to hold data, movies are in an object, actors are tuple
all_movies=[]
all_actors=[]
json_actors=[]
json_movies=[]
moviedict={}
actordict={}

url = "https://en.wikipedia.org/wiki/Morgan_Freeman"

r  = requests.get(url)
data = r.content
soup = BeautifulSoup(data, 'html.parser')
tags = soup.find('div',{'class' : 'div-col columns column-width'})
link = tags.findAll('a')

for ele in link:
    all_movies.append(ele.get('href'))
    #print(ele.get('href'))
logging.info("First of three starter pages parsed, all movies added")
url = "https://en.wikipedia.org/wiki/Johnny_Depp"

r  = requests.get(url)
data = r.content
soup = BeautifulSoup(data, 'html.parser')
tags = soup.find('div',{'class' : 'div-col columns column-width'})
link = tags.findAll('a')

for ele in link:
    all_movies.append(ele.get('href'))
    #print(ele.get('href'))
logging.info("Second of three starter pages parsed, all movies added")
url = "https://en.wikipedia.org/wiki/Adam_Sandler"

r  = requests.get(url)
data = r.content
soup = BeautifulSoup(data, 'html.parser')
tags = soup.find('div',{'class' : 'div-col columns column-count column-count-2'})
link = tags.findAll('a')

for ele in link:
    all_movies.append(ele.get('href'))
    #print(ele.get('href'))
logging.info("Third of three starter pages parsed, all movies added")
#while len(all_movies)<125 or len(all_actors)<250:

for movie in all_movies:
    url = "https://en.wikipedia.org"+movie
    logging.debug("Accessing page "+movie+" to find actors")
    r  = requests.get(url)
    data = r.content
    soup = BeautifulSoup(data, 'html.parser')
    pattern = re.compile(r'Starring')
    tags = soup.find(text=pattern).parent
    tag2 = tags.findNext('ul')
    link = tag2.findAll('a')
    tempActors=[]
    for ele in link:
        if ele.find("wiki")!=-1:
            all_actors.append(ele.get('href'))
            tempActors.append(ele.get('href')[6:])
            logging.info("All actors from page" +movie+ " added")
    pattern = re.compile(r'Release date')
    tags = soup.find(text=pattern)
    if tags is None:
        logging.warning("Could not find the release date from " +movie+": Skipping this page")
        continue
        
    tag2 = tags.parent.findNext('ul')
    tag3 = tag2.findNext('li')
    tempYear = tag3.text
    tempYear = tempYear.replace(u'\xa0', u' ')
    logging.info("Added release date from page" +movie)
    pattern = re.compile(r'Box office')
    tags = soup.find(text=pattern)
    if tags is None:
        logging.warning("Could not find the movie gross from " +movie+": Skipping this page")
        continue
    tag2 = tags.parent.findNext('td')
    tempGross = tag2.text
    if tempGross[-1] == ']':
        tempGross = tag2.text[:-3]
        logging.info("Added total gross from page" +movie)
    result = (movie[6:], tempYear, tempGross, tempActors)
    json_movies.append(result)
    print(result)
    moviedict[movie[6:]]=(tempYear, tempGross, tempActors)     

logging.debug("Accessing actor list to find age")

all_actors=list(set(all_actors))

while len(json_actors)<300:
    for actor in all_actors:
        url = "https://en.wikipedia.org"+actor
        r  = requests.get(url)
        data = r.content
        soup = BeautifulSoup(data, 'html.parser')
        tags = soup.find('span',{'class' : 'noprint ForceAgeToShow'})
        if tags is None:
            logging.warning("Could not find the actor age for " +actor+": Skipping this page")
            continue
        json_actors.append((actor[6:], tags.text[5:-1]))
        print(actor[6:], tags.text[5:-1])
        actordict[actor[6:]]=tags.text[5:-1]
        logging.info("Moving onto next actor")
print(len(json_movies))
print(len(json_actors))
print(json_movies)
print(json_actors)

with open('moviedata.txt', 'w+') as outfile:
    json.dump(json_movies, outfile)
with open('actordata.txt', 'w+') as outfile:
    json.dump(json_actors, outfile)  
with open('moviedict.txt', 'w+') as outfile:
    json.dump(moviedict, outfile)
with open('actordict.txt', 'w+') as outfile:
    json.dump(actordict, outfile)  
