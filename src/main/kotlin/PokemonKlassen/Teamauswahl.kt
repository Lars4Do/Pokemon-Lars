package PokemonKlassen

fun teamAuswahlSpieler1():MutableList<MutableList<Pokemon>> {

    println("Spieler 1, bitte gib eine Nummer ein.\n" +
            "Wähle 1 für Team Turtok\n" +
            "2 für Team Glurak\n" +
            "3 für Team Bisaflor.")

    val player1 = mutableListOf<MutableList<Pokemon>>()

    val input1 = readln().toInt()

    println("Spieler 1, dein Team besteht aus")

    when (input1) {
        1 -> player1.add(teamTurtok())
        2 -> player1.add(teamGlurak())
        3 -> player1.add(teamBisaflor())
    }
    return player1
}


fun teamAuswahlSpieler2():MutableList<MutableList<Pokemon>>{

    println("Spieler 2, bitte gib eine Nummer ein.\n" +
            "Wähle 1 für Team Turtok\n" +
            "2 für Team Glurak\n" +
            "3 für Team Bisaflor.")

    val player2 = mutableListOf<MutableList<Pokemon>>()

    val input2 = readln().toInt()

    println("Spieler 2, dein Team besteht aus")

    when(input2){
        1 -> player2.add(teamTurtok())
        2 -> player2.add(teamGlurak())
        3 -> player2.add(teamBisaflor())
    }
    return player2
}
