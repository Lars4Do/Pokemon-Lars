package PokemonKlassen

import PokemonTyp

enum class PokemonAttacke(
    val typ: PokemonTyp,
    val schaden: Int,
    val genauigkeit: Int,) {

    Hydropumpe(PokemonTyp.WASSER, 110, 80),
    Orkan(PokemonTyp.FLUG, 110, 70),
    Eisstrahl(PokemonTyp.EIS, 90, 100),
    Hausbruch(PokemonTyp.NORMAL, 0, 100),
    Schutzschild(PokemonTyp.NORMAL, 0, 100),
    Donner(PokemonTyp.ELEKTRO, 110, 70),
    Hitzewelle(PokemonTyp.FEUER, 95, 90),
    Ruheort(PokemonTyp.FLUG, 0, 100),
    Psychokinese(PokemonTyp.PSYCHO, 90, 100),
    Sonnentag(PokemonTyp.FEUER, 0, 100),
    Solarstrahl(PokemonTyp.PFLANZE, 120, 100),
    Feuersturm(PokemonTyp.FEUER, 110, 85),
    Brandsand(PokemonTyp.BODEN, 70, 100),
    Luftschnitt(PokemonTyp.FLUG, 75, 95),
    Erdbeben(PokemonTyp.BODEN, 100, 100),
    Feuerschlag(PokemonTyp.FEUER, 75, 100),
    Protzer(PokemonTyp.NORMAL, 0, 100),
    Läuterfeuer(PokemonTyp.FEUER, 100, 95),
    Fruststampfer(PokemonTyp.BODEN, 75, 100),
    Erdkräfte(PokemonTyp.BODEN, 90, 100),
    Matschbombe(PokemonTyp.GIFT, 90, 100),
    Schlafpuder(PokemonTyp.PFLANZE, 0, 75),
    Drachenpuls(PokemonTyp.DRACHE, 85, 100),
    Donnerblitz(PokemonTyp.ELEKTRO, 90, 100),
    Meteorologe(PokemonTyp.NORMAL, 50, 100),
    Rückenwind(PokemonTyp.FLUG, 0, 100),
    Mondgewalt(PokemonTyp.FEE, 95, 100),
    Synthese(PokemonTyp.PFLANZE, 0, 100),
    Regentanz(PokemonTyp.WASSER, 0, 100),
    Eruption(PokemonTyp.FEUER, 150, 100),     //variiert, 150* (aktuelle kp/ max kp)
    Kaskade(PokemonTyp.WASSER, 80, 100),
    Drachentanz(PokemonTyp.DRACHE, 0, 100),
    Aquadurchstoß(PokemonTyp.WASSER, 85, 100),
    Wutanfall(PokemonTyp.DRACHE, 120, 100);
}
