# nimesa-assignment-solution
Nimesa Assignment Solution


# Here are 3 url for geting the result of given 3 assignment problem

Problem -1 : Return day which had the maximum temperature
url---- http://localhost:8111/getDayMaxTemp
this url method is GET
it will return day(in String format) which has maximum temperature 

eg:-
2019-03-30 14:00:00

Problem -2 : For a given date return temp_min,temp_max,humidity,main under weathe
url---- http://localhost:8111/getPerticularData
this url method is GET
it will take a parameter name val. val will be the perticular date for which tha data willl be return
it will return an object which has  temp_min,temp_max,humidity,main

the url with request param is http://localhost:8111/getPerticularData?val=2019-03-27 18:00:00
here the request param is "val=2019-03-27 18:00:00"
eg:-
{
    "temp_min": "278.76",
    "humidity": "100",
    "main": "Clouds",
    "temp_max": "279.558"
}

Problem -3 : Return a list of dates when it will rain 

url----  http://localhost:8111/getRainDates
this url method is GET
it will return list of days with time when it will rain.

eg:-
[
    "2019-03-31 07:00:00",
    "2019-03-31 08:00:00",
    "2019-03-31 09:00:00",
    "2019-03-31 10:00:00",
    "2019-03-31 11:00:00",
    "2019-03-31 12:00:00",
    "2019-03-31 13:00:00",
    "2019-03-31 14:00:00",
    "2019-03-31 16:00:00"
]
