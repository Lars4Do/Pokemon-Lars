package pokemonKlassen

import enumKlassenTypenUndAttacken.PokemonAttacke
import enumKlassenTypenUndAttacken.PokemonTyp

class Entei():Pokemon(
    "Entei",
    PokemonTyp.FEUER,
    null,
    50,
    "Überreste",
    "Feuerfänger",
    mutableListOf(PokemonAttacke.Läuterfeuer, PokemonAttacke.Fruststampfer, PokemonAttacke.Schutzschild, PokemonAttacke.Solarstrahl),
    222.0,
    183,
    150,
    156,
    139,
    167) {
}