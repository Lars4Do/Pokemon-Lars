package pokemonKlassen

import enumKlassenTypenUndAttacken.PokemonAttacke
import enumKlassenTypenUndAttacken.PokemonTyp

class Elezard():Pokemon(
    "Elezard",
    PokemonTyp.NORMAL,
    PokemonTyp.ELEKTRO,
    50,
    mutableListOf(PokemonAttacke.Drachenpuls, PokemonAttacke.Ladungsstoß, PokemonAttacke.Donnerblitz, PokemonAttacke.Meteorologe),
    169.0,
    117,
    114,
    177,
    160,
    177) {
}