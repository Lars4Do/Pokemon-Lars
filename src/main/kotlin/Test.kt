import Funktionen.*
import Spieler.Player
import pokemonKlassen.Pokemon

/*import damage
import effektivitaet
import verrechnung*/


fun kampf() {

    val spieler1 = Player()
    val spieler2 = Player()


    println("Spieler 1, bitte gib deinen Namen ein")
    spieler1.name = readln()
    println(
        "Du bist also ${spieler1.name}.\n" +
                "Spieler 2, du bist dran, wie heißt du?"
    )
    spieler2.name = readln()
    println("Das ist kein sehr schöner Name...")
    Thread.sleep(3000)
    println("Naja, machen wir weiter.")
    Thread.sleep(1000)
    println("Das sind die 3 Teams aus denen Ihr eines wählen könnt.")
    Thread.sleep(1000)
    println(teamInformation())
    println("Nun wählt der Reihe nach ein Team aus.")
    Thread.sleep(1000)
    spieler1.team = teamAuswahlSpieler(spieler1)
    Thread.sleep(500)
    spieler2.team = teamAuswahlSpieler(spieler2)
    var pokemon1 = pokemonAuswahl(spieler1)
    var pokemon2 = pokemonAuswahl(spieler2)

    println(pokemon2.kp)
    while (pokemon1.kp > 0 && pokemon2.kp > 0) {

        val auswahlPlayer1 = attackenAuswahl(pokemon1)
        val auswahlPlayer2 = attackenAuswahl(pokemon2)

        if (pokemon1.initiative > pokemon2.initiative) {
            pokemon2.kp -= schadensBerechnung(pokemon1, pokemon2, auswahlPlayer1).toInt()
            if (pokemon2.kp > 0) {
                pokemon1.kp -= schadensBerechnung(pokemon2, pokemon1, auswahlPlayer2).toInt()
                if (pokemon1.kp <= 0) {
                    if (spieler1.team.size > 0) {
                        pokemon1 = pokemonAuswahl(spieler1)
                    } else {
                        println(
                            "${spieler1.name} hat keine Pokemon mehr.\n" +
                                    "Verloren!\n" +
                                    " ${spieler2.name} ist unser neuer Pokemon Weltmeister!!!"
                        )
                    }
                }
            } else if (spieler2.team.size > 0) {
                pokemon2 = pokemonAuswahl(spieler2)
            } else {
                println(
                    "${spieler2.name} hat keine Pokemon mehr.\n" +
                            "Verloren!\n" +
                            " ${spieler1.name} ist unser neuer Pokemon Weltmeister!!!"
                )
            }
        } else {
            pokemon1.kp -= schadensBerechnung(pokemon2, pokemon1, auswahlPlayer2).toInt()
            if (pokemon1.kp > 0) {
                pokemon2.kp -= schadensBerechnung(pokemon1, pokemon2, auswahlPlayer1).toInt()
                if (pokemon2.kp <= 0) {
                    if (spieler2.team.size > 0) {
                        pokemon2 = pokemonAuswahl(spieler2)
                    } else {
                        println(
                            "${spieler2.name} hat keine Pokemon mehr.\n " +
                                    "Verloren!\n" +
                                    " ${spieler1.name} ist unser neuer Pokemon Weltmeister!!!"
                        )
                    }
                }
            } else if (spieler1.team.size > 0) {
                pokemon1 = pokemonAuswahl(spieler1)
            } else {
                println(
                    "${spieler1.name} hat keine Pokemon mehr.\n " +
                            "Verloren!\n" +
                            " ${spieler2.name} ist unser neuer Pokemon Weltmeister!!!"
                )
            }
        }
    }
}












