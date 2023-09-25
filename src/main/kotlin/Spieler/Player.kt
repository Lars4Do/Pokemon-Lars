package Spieler

import pokemonKlassen.Pokemon



// Eine Klasse Player erstellt um später einfacher mit meinen 2 Spielern arbeiten zu können.

class Player (
    var name: String ="",
    var team: MutableList<Pokemon> = mutableListOf()

)





