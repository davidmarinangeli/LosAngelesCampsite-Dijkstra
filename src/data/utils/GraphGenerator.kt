package data.utils

import data.Campsite
import data.Graph

val one = Campsite(1)
val two = Campsite(2)
val three = Campsite(3)
val four = Campsite(4)
val five = Campsite(5)
val six = Campsite(6)
val seven = Campsite(7)
val eight = Campsite(8)
val nine = Campsite(9)
val ten = Campsite(10)
val eleven = Campsite(11)
val twelve = Campsite(12)
val thirteen = Campsite(13)
val fourteen = Campsite(14)
val fifteen = Campsite(15)
val sixteen = Campsite(16)


val distance = mapOf<Pair<Campsite, Campsite>, Int>(
    (one to two) to 1,
    (one to thirteen) to 1,

    (two to three) to 1,
    (two to one) to 1,

    (three to four) to 1,
    (three to two) to 1,

    (four to five) to 1,
    (four to three) to 1,

    (five to six) to 1,
    (five to four) to 1,

    (six to seven) to 1,
    (six to five) to 1,

    (seven to eight) to 1,
    (seven to six) to 1,

    (eight to nine) to 1,
    (eight to seven) to 1,
    (eight to fourteen) to 1,

    (nine to ten) to 1,
    (nine to eight) to 1,

    (ten to eleven) to 1,
    (ten to nine) to 1,

    (eleven to twelve) to 1,
    (eleven to ten) to 1,

    (twelve to thirteen) to 1,
    (twelve to eleven) to 1,

    (thirteen to one) to 1,
    (thirteen to sixteen) to 1,
    (thirteen to twelve) to 1,

    (fourteen to fifteen) to 1,
    (fourteen to eight) to 1,

    (fifteen to sixteen) to 1,
    (fifteen to fourteen) to 1,

    (sixteen to thirteen) to 1,
    (sixteen to fifteen) to 1

)


val edges: Map<Campsite, Set<Campsite>> = mapOf(
    one to setOf(two, thirteen),
    two to setOf(one, three),
    three to setOf(two, four),
    four to setOf(five, three),
    five to setOf(six, four),
    six to setOf(seven, five),
    seven to setOf(eight, six),
    eight to setOf(
        nine,
        seven,
        fourteen
    ),
    nine to setOf(ten, eight),
    ten to setOf(nine, eleven),
    eleven to setOf(twelve, ten),
    twelve to setOf(eleven, thirteen),
    thirteen to setOf(
        sixteen,
        one,
        twelve
    ),
    fourteen to setOf(fifteen, eight),
    fifteen to setOf(sixteen, fourteen),
    sixteen to setOf(thirteen, fifteen)
)


val graph = Graph<Campsite>(
    vertices = setOf(
        one,
        two,
        three,
        four,
        five,
        six,
        seven,
        eight,
        nine,
        ten,
        eleven,
        twelve,
        thirteen,
        fourteen,
        fifteen,
        sixteen
    ),
    edges = edges,
    weights = distance
)