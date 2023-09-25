package pokemonKlassen

import EnumKlassenTypenUndAttacken.PokemonAttacke

class Bisaflor():Pokemon(
    "Bisaflor",
    PokemonTyp.PFLANZE,
    PokemonTyp.GIFT,
    50,
    "Leben-Orb",
    "Chlorophyll",
    mutableListOf(PokemonAttacke.Solarstrahl, PokemonAttacke.Erdkräfte, PokemonAttacke.Matschbombe, PokemonAttacke.Schlafpuder),
    187,
    147,
    148,
    167,
    167,
    145) {
}