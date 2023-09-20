import PokemonKlassen.PokemonAttacke

enum class PokemonTyp {
    NORMAL,
    FEUER,
    WASSER,
    ELEKTRO,
    PFLANZE,
    EIS,
    KAMPF,
    GIFT,
    BODEN,
    FLUG,
    PSYCHO,
    KÄFER,
    GESTEIN,
    GEIST,
    DRACHE,
    UNLICHT,
    STAHL,
    FEE
}

val multiplikatoren = mapOf(
    PokemonTyp.NORMAL to mapOf(
        PokemonTyp.GESTEIN to 0.5,
        PokemonTyp.GEIST to 0.0,
        PokemonTyp.DRACHE to 1.0,
        PokemonTyp.NORMAL to 1.0,
        PokemonTyp.FEE to 1.0,
        PokemonTyp.GIFT to 1.0,
        PokemonTyp.WASSER to 1.0,
        PokemonTyp.FEUER to 1.0,
        PokemonTyp.FLUG to 1.0,
        PokemonTyp.ELEKTRO to 1.0,
        PokemonTyp.PSYCHO to 1.0,
        PokemonTyp.PFLANZE to 1.0,
        PokemonTyp.BODEN to 1.0,
        PokemonTyp.EIS to 1.0,
        PokemonTyp.KAMPF to 1.0,
        PokemonTyp.KÄFER to 1.0,
        PokemonTyp.STAHL to 0.5,
        PokemonTyp.UNLICHT to 1.0
    ),
    PokemonTyp.FEUER to mapOf(
        PokemonTyp.FEUER to 0.5,
        PokemonTyp.WASSER to 0.5,
        PokemonTyp.PFLANZE to 2.0,
        PokemonTyp.EIS to 2.0,
        PokemonTyp.KÄFER to 2.0,
        PokemonTyp.STAHL to 2.0,
        PokemonTyp.NORMAL to 1.0,
        PokemonTyp.DRACHE to 0.5,
        PokemonTyp.GIFT to 1.0,
        PokemonTyp.FLUG to 1.0,
        PokemonTyp.UNLICHT to 1.0,
        PokemonTyp.KAMPF to 1.0,
        PokemonTyp.BODEN to 1.0,
        PokemonTyp.PSYCHO to 1.0,
        PokemonTyp.ELEKTRO to 1.0,
        PokemonTyp.FEE to 1.0,
        PokemonTyp.GEIST to 1.0,
        PokemonTyp.GESTEIN to 0.5
    ),
    PokemonTyp.WASSER to mapOf(
        PokemonTyp.FEUER to 2.0,
        PokemonTyp.WASSER to 0.5,
        PokemonTyp.PFLANZE to 0.5,
        PokemonTyp.ELEKTRO to 0.5,
        PokemonTyp.EIS to 0.5,
        PokemonTyp.GESTEIN to 2.0,
        PokemonTyp.FEE to 1.0,
        PokemonTyp.NORMAL to 1.0,
        PokemonTyp.GIFT to 1.0,
        PokemonTyp.DRACHE to 0.5,
        PokemonTyp.GEIST to 1.0,
        PokemonTyp.PSYCHO to 1.0,
        PokemonTyp.FLUG to 1.0,
        PokemonTyp.KAMPF to 1.0,
        PokemonTyp.BODEN to 2.0,
        PokemonTyp.UNLICHT to 1.0,
        PokemonTyp.KÄFER to 1.0,
        PokemonTyp.STAHL to 1.0
    ),
    PokemonTyp.ELEKTRO to mapOf(
        PokemonTyp.WASSER to 2.0,
        PokemonTyp.ELEKTRO to 0.5,
        PokemonTyp.BODEN to 0.0,
        PokemonTyp.STAHL to 1.0,
        PokemonTyp.KÄFER to 1.0,
        PokemonTyp.UNLICHT to 1.0,
        PokemonTyp.FLUG to 2.0,
        PokemonTyp.KAMPF to 1.0,
        PokemonTyp.PSYCHO to 1.0,
        PokemonTyp.GEIST to 1.0,
        PokemonTyp.DRACHE to 0.5,
        PokemonTyp.GIFT to 1.0,
        PokemonTyp.NORMAL to 1.0,
        PokemonTyp.FEE to 1.0,
        PokemonTyp.FEUER to 1.0,
        PokemonTyp.GESTEIN to 1.0,
        PokemonTyp.EIS to 1.0,
        PokemonTyp.PFLANZE to 0.5
    ),
    PokemonTyp.PFLANZE to mapOf(
        PokemonTyp.WASSER to 2.0,
        PokemonTyp.ELEKTRO to 1.0,
        PokemonTyp.BODEN to 2.0,
        PokemonTyp.STAHL to 0.5,
        PokemonTyp.KÄFER to 0.5,
        PokemonTyp.UNLICHT to 1.0,
        PokemonTyp.FLUG to 0.5,
        PokemonTyp.KAMPF to 1.0,
        PokemonTyp.PSYCHO to 1.0,
        PokemonTyp.GEIST to 1.0,
        PokemonTyp.DRACHE to 0.5,
        PokemonTyp.GIFT to 0.5,
        PokemonTyp.NORMAL to 1.0,
        PokemonTyp.FEE to 1.0,
        PokemonTyp.FEUER to 0.5,
        PokemonTyp.GESTEIN to 2.0,
        PokemonTyp.EIS to 1.0,
        PokemonTyp.PFLANZE to 0.5
    ),
    PokemonTyp.EIS to mapOf(
        PokemonTyp.WASSER to 0.5,
        PokemonTyp.ELEKTRO to 1.0,
        PokemonTyp.BODEN to 2.0,
        PokemonTyp.STAHL to 0.5,
        PokemonTyp.KÄFER to 1.0,
        PokemonTyp.UNLICHT to 1.0,
        PokemonTyp.FLUG to 2.0,
        PokemonTyp.KAMPF to 1.0,
        PokemonTyp.PSYCHO to 1.0,
        PokemonTyp.GEIST to 1.0,
        PokemonTyp.DRACHE to 2.0,
        PokemonTyp.GIFT to 1.0,
        PokemonTyp.NORMAL to 1.0,
        PokemonTyp.FEE to 1.0,
        PokemonTyp.FEUER to 0.5,
        PokemonTyp.GESTEIN to 2.0,
        PokemonTyp.EIS to 0.5,
        PokemonTyp.PFLANZE to 2.0
    ),
    PokemonTyp.KAMPF to mapOf(
        PokemonTyp.WASSER to 1.0,
        PokemonTyp.ELEKTRO to 1.0,
        PokemonTyp.BODEN to 1.0,
        PokemonTyp.STAHL to 2.0,
        PokemonTyp.KÄFER to 0.5,
        PokemonTyp.UNLICHT to 2.0,
        PokemonTyp.FLUG to 0.5,
        PokemonTyp.KAMPF to 1.0,
        PokemonTyp.PSYCHO to 0.5,
        PokemonTyp.GEIST to 0.0,
        PokemonTyp.DRACHE to 1.0,
        PokemonTyp.GIFT to 0.5,
        PokemonTyp.NORMAL to 2.0,
        PokemonTyp.FEE to 0.5,
        PokemonTyp.FEUER to 1.0,
        PokemonTyp.GESTEIN to 2.0,
        PokemonTyp.EIS to 2.0,
        PokemonTyp.PFLANZE to 1.0
    ),
    PokemonTyp.GIFT to mapOf(
        PokemonTyp.WASSER to 1.0,
        PokemonTyp.ELEKTRO to 1.0,
        PokemonTyp.BODEN to 0.5,
        PokemonTyp.STAHL to 0.0,
        PokemonTyp.KÄFER to 1.0,
        PokemonTyp.UNLICHT to 1.0,
        PokemonTyp.FLUG to 1.0,
        PokemonTyp.KAMPF to 1.0,
        PokemonTyp.PSYCHO to 1.0,
        PokemonTyp.GEIST to 0.5,
        PokemonTyp.DRACHE to 1.0,
        PokemonTyp.GIFT to 0.5,
        PokemonTyp.NORMAL to 1.0,
        PokemonTyp.FEE to 2.0,
        PokemonTyp.FEUER to 1.0,
        PokemonTyp.GESTEIN to 0.5,
        PokemonTyp.EIS to 1.0,
        PokemonTyp.PFLANZE to 2.0
    ),
    PokemonTyp.BODEN to mapOf(
        PokemonTyp.WASSER to 1.0,
        PokemonTyp.ELEKTRO to 2.0,
        PokemonTyp.BODEN to 1.0,
        PokemonTyp.STAHL to 2.0,
        PokemonTyp.KÄFER to 0.5,
        PokemonTyp.UNLICHT to 1.0,
        PokemonTyp.FLUG to 0.0,
        PokemonTyp.KAMPF to 1.0,
        PokemonTyp.PSYCHO to 1.0,
        PokemonTyp.GEIST to 1.0,
        PokemonTyp.DRACHE to 1.0,
        PokemonTyp.GIFT to 2.0,
        PokemonTyp.NORMAL to 1.0,
        PokemonTyp.FEE to 1.0,
        PokemonTyp.FEUER to 2.0,
        PokemonTyp.GESTEIN to 2.0,
        PokemonTyp.EIS to 1.0,
        PokemonTyp.PFLANZE to 0.5
    ),
    PokemonTyp.FLUG to mapOf(
        PokemonTyp.WASSER to 1.0,
        PokemonTyp.ELEKTRO to 0.5,
        PokemonTyp.BODEN to 1.0,
        PokemonTyp.STAHL to 0.5,
        PokemonTyp.KÄFER to 2.0,
        PokemonTyp.UNLICHT to 1.0,
        PokemonTyp.FLUG to 1.0,
        PokemonTyp.KAMPF to 2.0,
        PokemonTyp.PSYCHO to 1.0,
        PokemonTyp.GEIST to 1.0,
        PokemonTyp.DRACHE to 1.0,
        PokemonTyp.GIFT to 1.0,
        PokemonTyp.NORMAL to 1.0,
        PokemonTyp.FEE to 1.0,
        PokemonTyp.FEUER to 1.0,
        PokemonTyp.GESTEIN to 0.5,
        PokemonTyp.EIS to 1.0,
        PokemonTyp.PFLANZE to 2.0
    ),
    PokemonTyp.PSYCHO to mapOf(
        PokemonTyp.WASSER to 1.0,
        PokemonTyp.ELEKTRO to 1.0,
        PokemonTyp.BODEN to 1.0,
        PokemonTyp.STAHL to 0.5,
        PokemonTyp.KÄFER to 1.0,
        PokemonTyp.UNLICHT to 0.0,
        PokemonTyp.FLUG to 1.0,
        PokemonTyp.KAMPF to 2.0,
        PokemonTyp.PSYCHO to 1.0,
        PokemonTyp.GEIST to 1.0,
        PokemonTyp.DRACHE to 1.0,
        PokemonTyp.GIFT to 2.0,
        PokemonTyp.NORMAL to 1.0,
        PokemonTyp.FEE to 1.0,
        PokemonTyp.FEUER to 1.0,
        PokemonTyp.GESTEIN to 1.0,
        PokemonTyp.EIS to 1.0,
        PokemonTyp.PFLANZE to 1.0
    ),
    PokemonTyp.KÄFER to mapOf(
        PokemonTyp.WASSER to 1.0,
        PokemonTyp.ELEKTRO to 1.0,
        PokemonTyp.BODEN to 1.0,
        PokemonTyp.STAHL to 0.5,
        PokemonTyp.KÄFER to 1.0,
        PokemonTyp.UNLICHT to 2.0,
        PokemonTyp.FLUG to 0.5,
        PokemonTyp.KAMPF to 0.5,
        PokemonTyp.PSYCHO to 2.0,
        PokemonTyp.GEIST to 0.5,
        PokemonTyp.DRACHE to 1.0,
        PokemonTyp.GIFT to 0.5,
        PokemonTyp.NORMAL to 1.0,
        PokemonTyp.FEE to 0.5,
        PokemonTyp.FEUER to 0.5,
        PokemonTyp.GESTEIN to 1.0,
        PokemonTyp.EIS to 1.0,
        PokemonTyp.PFLANZE to 0.5
    ),
    PokemonTyp.GESTEIN to mapOf(
        PokemonTyp.WASSER to 1.0,
        PokemonTyp.ELEKTRO to 1.0,
        PokemonTyp.BODEN to 0.5,
        PokemonTyp.STAHL to 0.5,
        PokemonTyp.KÄFER to 2.0,
        PokemonTyp.UNLICHT to 1.0,
        PokemonTyp.FLUG to 2.0,
        PokemonTyp.KAMPF to 0.5,
        PokemonTyp.PSYCHO to 1.0,
        PokemonTyp.GEIST to 1.0,
        PokemonTyp.DRACHE to 1.0,
        PokemonTyp.GIFT to 1.0,
        PokemonTyp.NORMAL to 1.0,
        PokemonTyp.FEE to 1.0,
        PokemonTyp.FEUER to 2.0,
        PokemonTyp.GESTEIN to 1.0,
        PokemonTyp.EIS to 2.0,
        PokemonTyp.PFLANZE to 1.0
    ),
    PokemonTyp.GEIST to mapOf(
        PokemonTyp.WASSER to 1.0,
        PokemonTyp.ELEKTRO to 1.0,
        PokemonTyp.BODEN to 1.0,
        PokemonTyp.STAHL to 0.5,
        PokemonTyp.KÄFER to 1.0,
        PokemonTyp.UNLICHT to 0.5,
        PokemonTyp.FLUG to 1.0,
        PokemonTyp.KAMPF to 1.0,
        PokemonTyp.PSYCHO to 2.0,
        PokemonTyp.GEIST to 2.0,
        PokemonTyp.DRACHE to 1.0,
        PokemonTyp.GIFT to 1.0,
        PokemonTyp.NORMAL to 0.0,
        PokemonTyp.FEE to 1.0,
        PokemonTyp.FEUER to 1.0,
        PokemonTyp.GESTEIN to 1.0,
        PokemonTyp.EIS to 1.0,
        PokemonTyp.PFLANZE to 1.0
    ),
    PokemonTyp.DRACHE to mapOf(
        PokemonTyp.WASSER to 1.0,
        PokemonTyp.ELEKTRO to 1.0,
        PokemonTyp.BODEN to 1.0,
        PokemonTyp.STAHL to 0.5,
        PokemonTyp.KÄFER to 1.0,
        PokemonTyp.UNLICHT to 1.0,
        PokemonTyp.FLUG to 1.0,
        PokemonTyp.KAMPF to 1.0,
        PokemonTyp.PSYCHO to 1.0,
        PokemonTyp.GEIST to 1.0,
        PokemonTyp.DRACHE to 2.0,
        PokemonTyp.GIFT to 1.0,
        PokemonTyp.NORMAL to 1.0,
        PokemonTyp.FEE to 0.0,
        PokemonTyp.FEUER to 1.0,
        PokemonTyp.GESTEIN to 1.0,
        PokemonTyp.EIS to 1.0,
        PokemonTyp.PFLANZE to 0.5
    ),
    PokemonTyp.UNLICHT to mapOf(
        PokemonTyp.WASSER to 1.0,
        PokemonTyp.ELEKTRO to 1.0,
        PokemonTyp.BODEN to 1.0,
        PokemonTyp.STAHL to 0.5,
        PokemonTyp.KÄFER to 1.0,
        PokemonTyp.UNLICHT to 0.5,
        PokemonTyp.FLUG to 1.0,
        PokemonTyp.KAMPF to 0.5,
        PokemonTyp.PSYCHO to 2.0,
        PokemonTyp.GEIST to 2.0,
        PokemonTyp.DRACHE to 1.0,
        PokemonTyp.GIFT to 1.0,
        PokemonTyp.NORMAL to 1.0,
        PokemonTyp.FEE to 0.5,
        PokemonTyp.FEUER to 1.0,
        PokemonTyp.GESTEIN to 1.0,
        PokemonTyp.EIS to 1.0,
        PokemonTyp.PFLANZE to 1.0
    ),
    PokemonTyp.STAHL to mapOf(
        PokemonTyp.WASSER to 0.5,
        PokemonTyp.ELEKTRO to 1.0,
        PokemonTyp.BODEN to 1.0,
        PokemonTyp.STAHL to 0.5,
        PokemonTyp.KÄFER to 1.0,
        PokemonTyp.UNLICHT to 1.0,
        PokemonTyp.FLUG to 1.0,
        PokemonTyp.KAMPF to 1.0,
        PokemonTyp.PSYCHO to 1.0,
        PokemonTyp.GEIST to 1.0,
        PokemonTyp.DRACHE to 1.0,
        PokemonTyp.GIFT to 1.0,
        PokemonTyp.NORMAL to 1.0,
        PokemonTyp.FEE to 1.0,
        PokemonTyp.FEUER to 0.5,
        PokemonTyp.GESTEIN to 2.0,
        PokemonTyp.EIS to 2.0,
        PokemonTyp.PFLANZE to 1.0
    ),
    PokemonTyp.FEE to mapOf(
        PokemonTyp.WASSER to 1.0,
        PokemonTyp.ELEKTRO to 1.0,
        PokemonTyp.BODEN to 1.0,
        PokemonTyp.STAHL to 0.5,
        PokemonTyp.KÄFER to 1.0,
        PokemonTyp.UNLICHT to 2.0,
        PokemonTyp.FLUG to 1.0,
        PokemonTyp.KAMPF to 2.0,
        PokemonTyp.PSYCHO to 1.0,
        PokemonTyp.GEIST to 1.0,
        PokemonTyp.DRACHE to 2.0,
        PokemonTyp.GIFT to 0.5,
        PokemonTyp.NORMAL to 1.0,
        PokemonTyp.FEE to 1.0,
        PokemonTyp.FEUER to 0.5,
        PokemonTyp.GESTEIN to 1.0,
        PokemonTyp.EIS to 1.0,
        PokemonTyp.PFLANZE to 1.0
    )
)




/*
Diese Funktion sucht den Schadensmultiplikator aus der "multiplikatoren.
Bei einem Gegner mit zwei Typen werden die Schadensmultiplikatoren auch direkt miteinander verrechnet.
*/


fun damage(meinAngriff: PokemonTyp, gegnerPokemon: Pair<PokemonTyp, PokemonTyp?>): Double? {
    val innerKey1 = gegnerPokemon.first
    val innerKey2 = gegnerPokemon.second

    val outerMap = multiplikatoren[meinAngriff]

    if (outerMap != null) {
        val schadenMultiplikator1 = outerMap[innerKey1]

        if (schadenMultiplikator1 != null) {
            val schadenMultiplikator2 = innerKey2?.let { outerMap[it] }

            if (schadenMultiplikator2 != null) {
                // Multipliziere die beiden Schadensmultiplikatoren
                val schaden = schadenMultiplikator1 * schadenMultiplikator2
                return schaden
            }
        }
    }

    // Wenn einer der Schadensmultiplikatoren nicht gefunden wurde, wird null zurückgegeben
    return null
}



/*
In dieser Funktion werden die Werte meines und des Gegner_Pokemon verrechnet.
Das ganze wird mit dem Schadenswert der Attacke multipliziert.
 */
fun verrechnung(meinAngriff: Int, gegnerVerteidigung: Int, schadensWertAttacke: Int): Int {
    val schaden = (meinAngriff / gegnerVerteidigung) * schadensWertAttacke


    return schaden
}
fun effektivitaet(): Double?{
    val schaden = verrechnung(100, 50, 110)

    println("Der Schaden beträgt: $schaden")

    val multiplikator = damage(PokemonTyp.GESTEIN, Pair(PokemonTyp.GESTEIN, PokemonTyp.PSYCHO))

    println("Der Multiplikator beträgt $multiplikator")

    val effektivitaet = multiplikator?.times(schaden)

    println("Der Schaden des Angriffs beträgt $effektivitaet")

    return effektivitaet
}



