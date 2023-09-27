package pokemonKlassen

import enumKlassenTypenUndAttacken.PokemonAttacke
import enumKlassenTypenUndAttacken.PokemonTyp

class Kokowei():Pokemon(
    "Kokowei",
    PokemonTyp.PFLANZE,
    PokemonTyp.PSYCHO,
    50,
    "Überreste",
    "Chlorophyll",
    mutableListOf(PokemonAttacke.Psychokinese, PokemonAttacke.Sonnentag, PokemonAttacke.Solarstrahl, PokemonAttacke.Synthese),
    202.0,
    161,
    150,
    194,
    139,
    117) {
}