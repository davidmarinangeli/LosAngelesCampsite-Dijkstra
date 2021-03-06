
<img src="https://raw.githubusercontent.com/davidmarinangeli/LosAngelesCampsite-Dijkstra/master/map.png" width="500"/>

# Los Angeles Campsite 
Kotlin application I did for a Technical task.

We have a map of campsites and a queue of guests who would like to reach their campsite. The array that comes from the JSON contains the Guest object with its destination. How much time each family (Guest) has to wait?

## Run it
The project can be run on any editor that has a Kotlin/Java interpeter. No further actions needed. 

## The Algorithm
The best algorithm for this task is the Dijkstra one ( any other implementation of a *shortest path* algorithm should work ) with the following structure:

 1. Each campsite is a vertex with a **name** ( its number ).
 2. Each path between two or more campsites is an edge and all of them have cost ( or weight ) **1**.

## Software Architecture Pattern  
I divided the purposes in several folders in order to make the code more readable and cleaner. It could be improved by dividing the **Model** ( to handle Data and Network requests ), **View** ( to display the result ) and **Controller** ( to take Network dat, apply the algorithm and give the result to the View ). 
  
## Libraries  
I used default Kotlin/Java libraries to handle the data and Gson library to parse the JSON object from network.
   
## Improvements   

 1. The first thing I would improve is the way the Graph is generated
 2. I would like to separate better the code ( as mentioned earlier ).
