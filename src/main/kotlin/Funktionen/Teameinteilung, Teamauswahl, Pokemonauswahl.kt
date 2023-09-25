package Funktionen

import Spieler.Player
import pokemonKlassen.*



// Hier habe ich 3 Funktionen geschrieben um meine Pokemon in meine gewünschten Teams zu unterteilen.
fun teamBisaflor():MutableList<Pokemon>{

    val bisaflor = Bisaflor()
    val kokowei = Kokowei()
    val elezard = Elezard()
    val groudon = Groudon()
    var team3 = mutableListOf(bisaflor, kokowei, elezard, groudon)

    println("$bisaflor \n$kokowei \n$elezard \n$groudon")

    return team3
}


fun teamGlurak() :MutableList<Pokemon>{
    val glurak = Glurak()
    val entei = Entei()
    val elfun = Elfun()
    val qurtel = Qurtel()
    val team1 = mutableListOf(glurak, entei, qurtel, elfun)

    println("$glurak \n$entei \n$elfun \n$qurtel")

    return team1
}



fun teamTurtok():MutableList<Pokemon>{
    val turtok = Turtok()
    val pelipper = Pelipper()
    val seedraking = Seedraking()
    val zapdos = Zapdos()
    val team2 = mutableListOf(turtok, pelipper, seedraking, zapdos)

    println("$turtok \n$pelipper \n$seedraking \n$zapdos")

    return team2
}




// Eine kleine Funktion um auszugeben welche Pokemon in welchem Team sind.

fun teamInformation():String{
    println("Das erste Team besteht aus:")
    teamTurtok()
    println("Es ist ein Sonnentag-Team.")
    readln()

    println("Das zweite Team besteht aus:")
    teamGlurak()
    println("Es ist ein Regentanz-Team.")
    readln()

    println("Das dritte Team besteht aus:")
    teamBisaflor()
    println("Es ist ebenfalls ein Sonnentag-Team.")

    return ""
}




// Hier gebe ich dem Spieler die Auswahl aus einem von 3 Teams.

fun teamAuswahlSpieler(spieler: Player):MutableList<Pokemon> {

    println("${spieler.name}, bitte gib eine Nummer ein.\n" +
            "Wähle\n" +
            "1 für Team Turtok\n" +
            "2 für Team Glurak\n" +
            "3 für Team Bisaflor.")

    var pokemonListe: MutableList<Pokemon> = mutableListOf()

    val input = readln().toInt()

    println("${spieler.name}, dein Team besteht aus")

    when (input) {
        1 -> pokemonListe = teamTurtok()
        2 -> pokemonListe = teamGlurak()
        3 -> pokemonListe = teamBisaflor()
        else -> {println("Ungültige Eingabe, versuche es noch einmal.")
            teamAuswahlSpieler(spieler)
        }

    }
    return pokemonListe
}


fun pokemonAuswahl(spieler: Player):Pokemon?{

    println("${spieler.name}, wähle dein Pokemon für den Kampf aus.\n" +
            "1 für ${spieler.team[0]}\n" +
            "2 für ${spieler.team[1]}\n" +
            "3 für ${spieler.team[2]}\n" +
            "4 für ${spieler.team[3]}")

    var pokemonImKampf: Pokemon? = null

    val input = readln().toInt()


    when(input){
        1 -> pokemonImKampf = spieler.team[0]
        2 -> pokemonImKampf = spieler.team[1]
        3 -> pokemonImKampf = spieler.team[2]
        4 -> pokemonImKampf = spieler.team[3]
        else -> {println("Ungültige Eingabe, versuch es noch einmal")
            pokemonAuswahl(spieler)
        }
    }
    return pokemonImKampf
}

