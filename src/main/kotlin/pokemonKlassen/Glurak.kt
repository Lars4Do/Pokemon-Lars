package pokemonKlassen

import enumKlassenTypenUndAttacken.PokemonAttacke
import enumKlassenTypenUndAttacken.PokemonTyp

class Glurak():Pokemon(
    "Glurak",
    PokemonTyp.FLUG,
    PokemonTyp.FEUER,
    50,
    mutableListOf(PokemonAttacke.Feuersturm, PokemonAttacke.Brandsand, PokemonAttacke.Luftschnitt, PokemonAttacke.Fokusstoß),
    185.0,
    149,
    143,
    177,
    150,
    167){
}