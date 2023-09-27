package pokemonKlassen

import enumKlassenTypenUndAttacken.PokemonAttacke
import enumKlassenTypenUndAttacken.PokemonTyp

class Groudon():Pokemon(
    "Groudon",
    PokemonTyp.BODEN,
    null,
    50,
    "Überreste",
    "Dürre",
    mutableListOf(PokemonAttacke.Erdbeben, PokemonAttacke.Feuerschlag, PokemonAttacke.Protzer, PokemonAttacke.Schutzschild),
    207.0,
    222,
    211,
    167,
    156,
    156) {
}