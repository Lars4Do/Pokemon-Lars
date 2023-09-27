package pokemonKlassen

import enumKlassenTypenUndAttacken.PokemonAttacke
import enumKlassenTypenUndAttacken.PokemonTyp

class Zapdos():Pokemon(
    "Zapdos",
    PokemonTyp.ELEKTRO,
    PokemonTyp.FLUG,
    50,
    "Tsitrubeere",
    "Statik",
    mutableListOf(PokemonAttacke.Donner, PokemonAttacke.Orkan, PokemonAttacke.Hitzewelle, PokemonAttacke.Ruheort),
    197.0,
    156,
    150,
    194,
    156,
    167) {
}