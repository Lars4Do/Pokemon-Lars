package pokemonKlassen

import enumKlassenTypenUndAttacken.PokemonAttacke
import enumKlassenTypenUndAttacken.PokemonTyp

class Glurak():Pokemon(
    "Glurak",
    PokemonTyp.FLUG,
    PokemonTyp.FEUER,
    50,
    "Leben-Orb",
    "Solarkraft",
    mutableListOf(PokemonAttacke.Feuersturm, PokemonAttacke.Brandsand, PokemonAttacke.Luftschnitt, PokemonAttacke.Ruheort),
    185.0,
    149,
    143,
    177,
    150,
    167){
}