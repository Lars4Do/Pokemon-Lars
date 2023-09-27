package pokemonKlassen

import enumKlassenTypenUndAttacken.PokemonAttacke
import enumKlassenTypenUndAttacken.PokemonTyp

class Elezard():Pokemon(
    "Elezard",
    PokemonTyp.NORMAL,
    PokemonTyp.ELEKTRO,
    50,
    "Heißbrocken",
    "Solarkraft",
    mutableListOf(PokemonAttacke.Drachenpuls, PokemonAttacke.Sonnentag, PokemonAttacke.Donnerblitz, PokemonAttacke.Meteorologe),
    169.0,
    117,
    114,
    177,
    160,
    177) {
}