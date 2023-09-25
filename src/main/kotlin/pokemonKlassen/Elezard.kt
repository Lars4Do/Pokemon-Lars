package pokemonKlassen

import EnumKlassenTypenUndAttacken.PokemonAttacke

class Elezard():Pokemon(
    "Elezard",
    PokemonTyp.NORMAL,
    PokemonTyp.ELEKTRO,
    50,
    "Heißbrocken",
    "Solarkraft",
    mutableListOf(PokemonAttacke.Drachenpuls, PokemonAttacke.Sonnentag, PokemonAttacke.Donnerblitz, PokemonAttacke.Meteorologe),
    169,
    117,
    114,
    177,
    160,
    177) {
}