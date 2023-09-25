package pokemonKlassen

import EnumKlassenTypenUndAttacken.PokemonAttacke

class Pelipper ():Pokemon(
    "Pelipper",
    PokemonTyp.WASSER,
    PokemonTyp.FLUG,
    50,
    "Nassbrocken",
    "Niesel",
    mutableListOf(PokemonAttacke.Orkan, PokemonAttacke.Hydropumpe, PokemonAttacke.Rückenwind, PokemonAttacke.Regentanz),
    167,
    112,
    167,
    161,
    134,
    128
)