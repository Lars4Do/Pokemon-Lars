package enumKlassenTypenUndAttacken


/**
 * Eine enum Klasse in der meine ganzen Angriffe für die einzelnen Pokemon abgespeichert sind.
 *
 * @param typ: Sagt aus, von welchem Typen der Angriff ist. (Bsp.: Donner ist vom Typ Elektro.)
 * @param schaden: Gibt den Schadenswert jedes einzelnen Angriffs an.
 * @param physischSpezial: Definiert, ob der Angriff physisch oder speziell ist.
 *                        (In Pokemon bedeutet das quasi, ob ein Angriff Fern- oder Nahkampf ist.)
 */


enum class PokemonAttacke(
    val typ: PokemonTyp,
    val schaden: Int,
    val physischSpezial: String){


    Hydropumpe(PokemonTyp.WASSER, 110, "Spezial"),
    Orkan(PokemonTyp.FLUG, 110, "Spezial"),
    Eisstrahl(PokemonTyp.EIS, 90, "Spezial"),
    Hausbruch(PokemonTyp.NORMAL, 0, "Physisch"),
    Knirscher(PokemonTyp.UNLICHT, 80, "Physisch"),
    Donner(PokemonTyp.ELEKTRO, 110, "Spezial"),
    Hitzewelle(PokemonTyp.FEUER, 95, "Spezial"),
    Energieball(PokemonTyp.PFLANZE, 90, "Spezial"),
    Psychokinese(PokemonTyp.PSYCHO, 90, "Spezial"),
    Ladungsstoß(PokemonTyp.ELEKTRO, 80, "Spezial"),
    Solarstrahl(PokemonTyp.PFLANZE, 120, "Spezial"),
    Feuersturm(PokemonTyp.FEUER, 110, "Spezial"),
    Brandsand(PokemonTyp.BODEN, 70, "Spezial"),
    Luftschnitt(PokemonTyp.FLUG, 75, "Spezial"),
    Erdbeben(PokemonTyp.BODEN, 100, "Physisch"),
    Feuerschlag(PokemonTyp.FEUER, 75, "Physisch"),
    Fokusstoß(PokemonTyp.KAMPF, 120, "Spezial"),
    Läuterfeuer(PokemonTyp.FEUER, 100, "Physisch"),
    Fruststampfer(PokemonTyp.BODEN, 75, "Physisch"),
    Erdkräfte(PokemonTyp.BODEN, 90, "Spezial"),
    Matschbombe(PokemonTyp.GIFT, 90, "Spezial"),
    Blättertanz(PokemonTyp.PFLANZE, 120, "Spezial"),
    Drachenpuls(PokemonTyp.DRACHE, 85, "Spezial"),
    Donnerblitz(PokemonTyp.ELEKTRO, 90, "Spezial"),
    Meteorologe(PokemonTyp.NORMAL, 50, "Spezial"),
    Abgrundsklinge(PokemonTyp.BODEN, 120, "Physisch"),
    Mondgewalt(PokemonTyp.FEE, 95, "Spezial"),
    Donnerschlag(PokemonTyp.ELEKTRO, 75, "Physisch"),
    Psychoschock(PokemonTyp.PSYCHO, 80, "Spezial"),
    Eruption(PokemonTyp.FEUER, 150, "Spezial"),
    Kaskade(PokemonTyp.WASSER, 80, "Physisch"),
    Sprungfeder(PokemonTyp.FLUG, 85, "Physisch"),
    Aquadurchstoß(PokemonTyp.WASSER, 85, "Physisch"),
    Wutanfall(PokemonTyp.DRACHE, 120, "Physisch"),
    Aurasphäre(PokemonTyp.KAMPF, 80, "Spezial"),
    AntikKraft(PokemonTyp.GESTEIN, 60, "Spezial")
}

