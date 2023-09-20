package PokemonKlassen

import PokemonTyp

class PokemonAttacke(
    val name: String,
    val typ: PokemonTyp,
    val schaden: Int,
    val genauigkeit: Int,
)

fun main() {
    val schaden = mutableListOf<PokemonAttacke>()

    // Eine Liste von Beispiel-Pokemon-Attacken mit Typ, Schadenswert und Genauigkeit
    val beispielAttacken = listOf(
        PokemonAttacke("Hydropumpe", PokemonTyp.WASSER, 110, 80),
        PokemonAttacke("Orkan", PokemonTyp.FLUG, 110, 70),
        PokemonAttacke("Eisstrahl", PokemonTyp.EIS, 90, 100),
        PokemonAttacke("Hausbruch", PokemonTyp.NORMAL, 0, 100),
        PokemonAttacke("Schutzschild", PokemonTyp.NORMAL, 0, 100),
        PokemonAttacke("Donner", PokemonTyp.ELEKTRO, 110, 70),
        PokemonAttacke("Hitzewelle", PokemonTyp.FEUER, 95, 90),
        PokemonAttacke("Ruheort", PokemonTyp.FLUG, 0, 100),
        PokemonAttacke("Psychokinese", PokemonTyp.PSYCHO, 90, 100),
        PokemonAttacke("Sonnentag", PokemonTyp.FEUER, 0, 100),
        PokemonAttacke("Solarstrahl", PokemonTyp.PFLANZE, 120, 100),
     //   PokemonAttacke("Synthese",)
        // Fügen Sie weitere Attacken hier hinzu
    )
}
