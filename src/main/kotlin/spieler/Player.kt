package spieler

import pokemonKlassen.Pokemon


/**
 * Eine Klasse um die beiden Spieler bestimmen zu können.
 *
 * @param name: Hier wird aktuell ein leerer String abgespeichert um sich später einen NAmen geben zu können.
 * @param team: Hier wird das ausgewählte Team abgespeichert.
 */

class Player (
    var name: String ="",
    var team: MutableList<Pokemon> = mutableListOf()
)





