package Funktionen
import multiplikatoren
import pokemonKlassen.Pokemon
import EnumKlassenTypenUndAttacken.PokemonAttacke


/*
Diese Funktion sucht den Schadensmultiplikator aus der "multiplikatoren".
Bei einem Gegner mit zwei Typen werden die Schadensmultiplikatoren auch direkt miteinander verrechnet.
*/

fun typenMultiplikator(meinAngriff: PokemonAttacke, gegnerPokemon: Pokemon): Double? {
    val innerKey1 = gegnerPokemon.typ1
    val innerKey2 = gegnerPokemon.typ2

    val outerMap = multiplikatoren[meinAngriff.typ]

    if (outerMap != null) {
        val schadenMultiplikator1 = outerMap[innerKey1]
        // TODO prüfe schadenMultiplikator1 != null
        if (innerKey2 != null) {
            val schadenMultiplikator2 = outerMap[innerKey2]

            if (schadenMultiplikator2 != null) {
                // Multipliziere die beiden Schadensmultiplikatoren
                val schaden = schadenMultiplikator1?.times(schadenMultiplikator2)
                return schaden
            }
        }else {
            val schaden = schadenMultiplikator1!!
            return schaden
        }
    }
    return null                  // Wenn einer der Schadensmultiplikatoren nicht gefunden wurde, wird null zurückgegeben
}







/*
In dieser Funktion werden die Werte meines und des Gegner_Pokemon verrechnet.
Das Ganze wird mit dem Schadenswert der Attacke multipliziert.
 */

fun satatusWertBerechnung(meinAngriff: Int, gegnerVerteidigung: Int, schadensWertAttacke: Int): Double {
    val schaden = (meinAngriff.toDouble() / gegnerVerteidigung.toDouble()) * schadensWertAttacke.toDouble()

    return schaden
}







/*
Diese Funktion berechnet den ausgeteilten Schaden basierend auf den Pokemon.
Bsp.: Glurak nutzt eine Attacke vom Typ Feuer, diese Attacke hat Schadenswert x.
Schadenswert x wird dann über die Funktionen "typenMultiplikatoren" und "statusWertBerechnung" miteinander
verrechnet.
 */

fun schadensBerechnung(meinPokemon: Pokemon, gegnerPokemon: Pokemon, schadensWertAttacke: PokemonAttacke): Double {


    println("${meinPokemon.name} setzt ${schadensWertAttacke.name} ein")


    if(schadensWertAttacke.physischSpezial.contains("Spezial")){
        val speziellerSchaden = satatusWertBerechnung(meinPokemon.spezialAngriff, gegnerPokemon.spezialverteidigung, schadensWertAttacke.schaden)
        println("Der Schaden beträgt: ${schadensWertAttacke.schaden}")

        val multiplikator = typenMultiplikator(schadensWertAttacke, gegnerPokemon)
        println("Der Multiplikator beträgt $multiplikator")

        val speziellerGesamtSchaden = multiplikator?.times(speziellerSchaden)
        if (speziellerGesamtSchaden != null) {
            println("Der Schaden des Angriffs beträgt ${speziellerGesamtSchaden.toInt()}")
        }
        val neuerKPWert = gegnerPokemon.kp - speziellerGesamtSchaden!!
        if (neuerKPWert > 0){
        println("${gegnerPokemon.name} hat noch ${neuerKPWert.toInt()} Kp.")
        }else{
            println("Die Kp sind auf 0 gefallen, ${gegnerPokemon.name} wurde besiegt.")
        }

        return speziellerGesamtSchaden

    }
    else{
        val physischerSchaden = satatusWertBerechnung(meinPokemon.angriff, gegnerPokemon.verteidigung, schadensWertAttacke.schaden)
        println("Der Schaden beträgt: ${schadensWertAttacke.schaden}")
        val multiplikator = typenMultiplikator(schadensWertAttacke, gegnerPokemon)
        println("Der Multiplikator beträgt $multiplikator")
        val physischerGesamtSchaden = multiplikator?.times(physischerSchaden)
        println("Der Schaden des Angriffs beträgt $physischerGesamtSchaden")

        val neuerKPWert = gegnerPokemon.kp - physischerGesamtSchaden!!
        if (neuerKPWert > 0){
            println("${gegnerPokemon.name} hat noch ${neuerKPWert.toInt()} Kp.")
        }else{
            println("Die Kp sind auf 0 gefallen, ${gegnerPokemon.name} wurde besiegt.")
        }

        return physischerGesamtSchaden
    }
}








