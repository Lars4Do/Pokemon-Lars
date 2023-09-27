package pokemonKlassen

import enumKlassenTypenUndAttacken.PokemonAttacke
import enumKlassenTypenUndAttacken.PokemonTyp

class Bisaflor():Pokemon(
    "Bisaflor",
    PokemonTyp.PFLANZE,
    PokemonTyp.GIFT,
    50,
    mutableListOf(PokemonAttacke.Solarstrahl, PokemonAttacke.Erdkräfte, PokemonAttacke.Matschbombe, PokemonAttacke.Blättertanz),
    187.0,
    147,
    148,
    167,
    167,
    145) {
}