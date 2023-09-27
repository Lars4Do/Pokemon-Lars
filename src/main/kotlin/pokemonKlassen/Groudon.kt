package pokemonKlassen

import enumKlassenTypenUndAttacken.PokemonAttacke
import enumKlassenTypenUndAttacken.PokemonTyp

class Groudon():Pokemon(
    "Groudon",
    PokemonTyp.BODEN,
    null,
    50,
    mutableListOf(PokemonAttacke.Erdbeben, PokemonAttacke.Feuerschlag, PokemonAttacke.Abgrundsklinge, PokemonAttacke.Donnerschlag),
    207.0,
    222,
    211,
    167,
    156,
    156) {
}