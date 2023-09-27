package pokemonKlassen

import enumKlassenTypenUndAttacken.PokemonAttacke
import enumKlassenTypenUndAttacken.PokemonTyp

class Pelipper ():Pokemon(
    "Pelipper",
    PokemonTyp.WASSER,
    PokemonTyp.FLUG,
    50,
    mutableListOf(PokemonAttacke.Orkan, PokemonAttacke.Hydropumpe, PokemonAttacke.Eisstrahl, PokemonAttacke.Meteorologe),
    167.0,
    112,
    167,
    161,
    134,
    128
)