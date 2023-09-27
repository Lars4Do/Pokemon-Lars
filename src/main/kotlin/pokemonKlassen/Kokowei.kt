package pokemonKlassen

import enumKlassenTypenUndAttacken.PokemonAttacke
import enumKlassenTypenUndAttacken.PokemonTyp

class Kokowei():Pokemon(
    "Kokowei",
    PokemonTyp.PFLANZE,
    PokemonTyp.PSYCHO,
    50,
    mutableListOf(PokemonAttacke.Psychokinese, PokemonAttacke.Matschbombe, PokemonAttacke.Solarstrahl, PokemonAttacke.Psychoschock),
    202.0,
    161,
    150,
    194,
    139,
    117) {
}