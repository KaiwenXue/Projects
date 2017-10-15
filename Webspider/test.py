from bs4 import BeautifulSoup
import requests
import re
import json

with open('actordata.txt') as json_data:
    actorlist = json.load(json_data)
print(actorlist)
with open('moviedata.txt') as json_data:
    movielist = json.load(json_data)
print(movielist)
    
all_movies=[]
all_actors=[]

actor = input("please enter an actor name with its wikipedia url format\n")
movie = input("please enter a movie name with its wikipedia url format\n")

#ACTOR TESTER
#you can use Adam_Sandler
url = "https://en.wikipedia.org/wiki/"+actor
r  = requests.get(url)
data = r.content
soup = BeautifulSoup(data, 'html.parser')
tags = soup.find('span',{'class' : 'noprint ForceAgeToShow'})
print((actor, tags.text[5:-1]))



#MOVIE TESTER
#you can use Click_(2006_film)
url = "https://en.wikipedia.org/wiki/"+movie

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
pattern = re.compile(r'Release date')
tags = soup.find(text=pattern).parent
tag2 = tags.findNext('ul')
tag3 = tag2.findNext('li')
tempYear = tag3.text
tempYear = tempYear.replace(u'\xa0', u' ')
pattern = re.compile(r'Box office')
tags = soup.find(text=pattern).parent
tag2 = tags.findNext('td')
tempGross = tag2.text
if tempGross[-1] == ']':
    tempGross = tag2.text[:-3]
result = (url, tempYear, tempGross, tempActors)
print(result)



