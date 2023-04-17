fun main(args: Array<String>)
//Ruben Hernandez
//4/16/2023
{
    val responses = arrayOf("Yes, of course!", "Without a doubt, yes.", "You can count on it.",
        "For sure!", "Ask me later.", "I'm not sure.", "I can't tell you right now.",
        "I'll tell you after my nap.", "No way!", "I don't think so.", "Without a doubt, no.",
        "The answer is clearly NO.")

    var playAgain = true

    while (playAgain)
    {
        println("Ask a yes or no question:")
        readLine()
        val responseIndex = (0 until responses.size).random()
        println(responses[responseIndex])

        println("Do you want to ask another question? Type: y/n")
        val answer = readLine()?.lowercase()
        playAgain = answer == "y"
    }
}
