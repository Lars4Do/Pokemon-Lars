package pokemonKlassen

import enumKlassenTypenUndAttacken.PokemonAttacke
import enumKlassenTypenUndAttacken.PokemonTyp

class Qurtel():Pokemon(
    "Qurtel",
    PokemonTyp.FEUER,
    null,
    50,
    mutableListOf(PokemonAttacke.Eruption, PokemonAttacke.Solarstrahl, PokemonAttacke.Erdkräfte, PokemonAttacke.Matschbombe),
    177.0,
    150,
    211,
    150,
    134,
    79) {
}