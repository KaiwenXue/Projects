import json

with open('actordict.txt') as json_data:
    actorlist = json.load(json_data)

with open('moviedict.txt') as json_data:
    movielist = json.load(json_data)

option = input("What would you like to know? Please choose a number\n1.Find how much a movie has grossed\n2.List which actors worked in a movie\n3.List the oldest X actors\n4.List all the actors for a given year\n")

#1. Find how much a movie has grossed 
#test with Fantastic_Beasts_and_Where_to_Find_Them_(film)
#2. List which actors worked in a movie
#3. List the oldest X actors
#4. List all the actors for a given year
#test 1982

print(actorlist)

if option == '1':
    name = input("Choose the movie you would like to know\n")
    test = movielist[name]
    print(test[1])
elif option == '2':
    name = input("Choose the movie you would like to know\n")
    test = movielist[name]
    print(test[2])
elif option == '3':
    num = input("how many actors do you want to see?\n")
    templist = sorted(actorlist.items(), key=lambda x:x[1],reverse=True)
    print(templist[:int(num)])
elif option == '4':
    num = input("Which year?\n")
    searchAge = 2017-int(num)
    for name, age in actorlist.items():
        if int(age) == searchAge:
            print(name)