package funktionen

import enumKlassenTypenUndAttacken.PokemonAttacke
import spieler.Player
import pokemonKlassen.*


/**
 * Hier habe ich 3 Funktionen geschrieben, um meine Pokemon in meine gewünschten Teams zu unterteilen.
 * @return: Gibt eine Liste mit den 4 hinzugefügten Pokemon zurück. (Gleiches gilt für die Funktion "teamGlurak" und "teamTurtok".)
 */

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


/**
 * Eine kleine Funktion um die Teaminformationen auszugeben.
 *
 * @return: Gibt die Teaminformationen zurück.
 */

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






/**
 * Eine Funktion um beiden Spielern die Möglichkeit zu geben eins von drei Teams auszuwählen.
 *
 * @param spieler: Gibt den Spieler an, der sich ein Team aussuchen kann.
 *
 * @return: Gibt das Team als MutableList zurück.
 */

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


/**
 * Eine Funktion um auszuwählen welches Pokemon man in den Kampf schicken möchte.
 *
 * @param spieler: Gibt den Spieler und sein zuvor ausgesuchtes Team an.
 *
 * @return: Gibt das Pokemon zurück welches in den Kampf geschickt werden soll.
 */

fun pokemonAuswahl(spieler: Player):Pokemon{

    println("${spieler.name}, wähle dein Pokemon für den Kampf aus.\n" )
          for((i,pokemon) in spieler.team.withIndex()){
              println("Drücke ${i+1} für ${pokemon}")
          }
    val pokemonImKampf: Pokemon

    val input = readln().toInt()


    pokemonImKampf = if (input <= spieler.team.size){
        spieler.team[input-1]
    }else {println("Ungültige Eingabe, versuch es noch einmal")
        pokemonAuswahl(spieler)
    }

    spieler.team.remove(pokemonImKampf)
    return pokemonImKampf
}





/**
 * Eine Funktion um auszuwählen welche Attacke das Pokemon welches aktuell am Kampf teilnimmt einsetzen soll.
 *
 * @param pokemon: Gibt das pokemon an welches sich aktuell im Kampf befindet.
 *
 * @return: Gibt die ausgewählte Attacke zurück.
 */

fun attackenAuswahl(pokemon: Pokemon):PokemonAttacke{


    println("Gib eine Nummer ein für die jeweilige Attacke.")

    var zahl: Int = 1
    for (attacke in pokemon.attacke){
        print(zahl)
        println(" für $attacke")
        zahl++
    }
    val input = readln().toInt()
    val attacke: PokemonAttacke

    when(input){
        1 -> attacke = pokemon.attacke[0]
        2 -> attacke = pokemon.attacke[1]
        3 -> attacke = pokemon.attacke[2]
        4 -> attacke = pokemon.attacke[3]
        else ->{ println("ungültig")
            attacke = attackenAuswahl(pokemon)
        }
    }
    println("$pokemon setzt $attacke ein")
    return attacke

}

