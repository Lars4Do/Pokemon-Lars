package pokemonKlassen

import enumKlassenTypenUndAttacken.PokemonAttacke
import enumKlassenTypenUndAttacken.PokemonTyp

class Bisaflor():Pokemon(
    "Bisaflor",
    PokemonTyp.PFLANZE,
    PokemonTyp.GIFT,
    50,
    "Leben-Orb",
    "Chlorophyll",
    mutableListOf(PokemonAttacke.Solarstrahl, PokemonAttacke.Erdkräfte, PokemonAttacke.Matschbombe, PokemonAttacke.Schlafpuder),
    187.0,
    147,
    148,
    167,
    167,
    145) {
}