import Funktionen.*
import Spieler.Player
import pokemonKlassen.Pokemon

/*import damage
import effektivitaet
import verrechnung*/


fun main() {

    val spieler1 = Player()
    val spieler2 = Player()


    println("Spieler 1, bitte gib deinen Namen ein")
    spieler1.name = readln()
    println(
        "Du bist also ${spieler1.name}.\n" +
                "Spieler 2, du bist dran, wie heißt du?"
    )
    spieler2.name = readln()
    /*    println("Das ist kein sehr schöner Name...")
    Thread.sleep(3000)
    println("Naja, machen wir weiter.")
    Thread.sleep(1000)
    println("Das sind die 3 Teams aus denen Ihr eines wählen könnt.")
    Thread.sleep(1000)
    println(teamInformation())
    println("Nun wählt der Reihe nach ein Team aus.")
    Thread.sleep(1000)*/
    spieler1.team = teamAuswahlSpieler(spieler1)
    Thread.sleep(3000)
    spieler2.team = teamAuswahlSpieler(spieler2)
    val pokemon1 = pokemonAuswahl(spieler1)
    val pokemon2 = pokemonAuswahl(spieler2)

    if (pokemon1 != null) {
        if (pokemon2 != null) {
            println(pokemon2.kp)
            while (pokemon1.kp > 0 && pokemon2.kp > 0) {
                println(pokemon2.kp)
                val auswahl = attackenAuswahl(pokemon1)
                pokemon2.kp -= schadensBerechnung(pokemon1, pokemon2, auswahl).toInt()
            }
        }
    }
}










