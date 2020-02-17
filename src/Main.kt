import data.Campsite
import network.getGuestList
import data.utils.graph
import data.utils.one

fun main() {

    val guestList = getGuestList()
    var globalWaitTime = 0

    val pathFrom = dijkstra(graph, one)

    guestList.forEachIndexed { index, guest ->

        val campsite: Campsite? = graph.vertices.find { campsite -> campsite.name == guest.caravan }

        if (campsite !== null) {

            // the path made of Campsite visited
            val path = shortestPath(pathFrom, one, campsite)
            // its size
            val pathSize = path.size

            // the path formatted to print campsite's name only
            val readablePath: List<Int> = path.map { t -> t.name }

            // let's increase the global "stopwatch" that gives us what's the global wait time
            globalWaitTime += pathSize

            val waitTimeString =
                if (index != 0) " Since it has to wait the families before, it will take $globalWaitTime minutes. " else ""

            println(
                "The family number ${guest.familyid}" +
                        " would take $pathSize minutes" +
                        " to arrive at the campsite number ${guest.caravan}." +
                        " $waitTimeString" +
                        "Here is the path $readablePath. "
            )
        } else {
            println("Campsite not found")
        }
    }

}

