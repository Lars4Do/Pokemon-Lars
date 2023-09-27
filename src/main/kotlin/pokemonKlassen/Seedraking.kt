package pokemonKlassen

import enumKlassenTypenUndAttacken.PokemonAttacke
import enumKlassenTypenUndAttacken.PokemonTyp

class Seedraking():Pokemon(
    "Seedraking",
    PokemonTyp.DRACHE,
    PokemonTyp.WASSER,
    50,
    "Leben-Orb",
    "Wassertempo",
    mutableListOf(PokemonAttacke.Kaskade, PokemonAttacke.Drachentanz, PokemonAttacke.Wutanfall, PokemonAttacke.Aquadurchstoß),
    182.0,
    161,
    161,
    161,
    161,
    150) {
}