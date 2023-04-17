fun main(args: Array<String>)
//Ruben Hernandez
//4/16/2023
{
    val rooms = arrayOf(
        "You are in a dusty castle room.\nPassages lead to the north and south.",
        "You are in the armory.\nThere is a room off to the south.",
        "You are in a torch-lit hallway.\nThere are rooms to the east and west.",
        "You are in a bedroom. A window overlooks the castle courtyard.\nA hallway is to the west.",
        "You are in the kitchen. It looks like a roast is being made for supper.\nA hallway is to the east."
    )
    var currentRoom = 0
    var done = false

    while (!done)
    {
        println(rooms[currentRoom])

        print("What direction? ")
        val input = readLine()?.trim()?.toLowerCase()

        val nextRoom = when (input)
        {
            "n" -> currentRoom - 1
            "e" -> currentRoom + 2
            "s" -> currentRoom + 1
            "w" -> currentRoom - 2
            else -> {
                println("Invalid direction.")
                null
            }
        }

        if (nextRoom != null && nextRoom in rooms.indices)
        {
            currentRoom = nextRoom
        }
        else
        {
            println("You cannot go that way.")
        }
    }
}
