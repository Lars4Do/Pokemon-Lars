package pokemonKlassen

import EnumKlassenTypenUndAttacken.PokemonAttacke

class Qurtel():Pokemon(
    "Qurtel",
    PokemonTyp.FEUER,
    null,
    50,
    "Heißbrocken",
    "Dürre",
    mutableListOf(PokemonAttacke.Eruption, PokemonAttacke.Solarstrahl, PokemonAttacke.Erdkräfte, PokemonAttacke.Schutzschild),
    177,
    150,
    211,
    150,
    134,
    79) {
}