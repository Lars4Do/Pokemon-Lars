package pokemonKlassen

import enumKlassenTypenUndAttacken.PokemonAttacke
import enumKlassenTypenUndAttacken.PokemonTyp

class Turtok ():Pokemon(
    "Turtok",
    PokemonTyp.WASSER,
    null,
    50,
    mutableListOf(PokemonAttacke.Hydropumpe, PokemonAttacke.Eisstrahl, PokemonAttacke.Drachenpuls, PokemonAttacke.Aurasphäre),
    186.0,
    148,
    167,
    150,
    172,
    143){
}


