package PokemonKlassen

import PokemonTyp
import multiplikatoren

/*
Diese Funktion sucht den Schadensmultiplikator aus der "multiplikatoren".
Bei einem Gegner mit zwei Typen werden die Schadensmultiplikatoren auch direkt miteinander verrechnet.
*/


fun damage(meinAngriff: PokemonAttacke, gegnerPokemon: Pair<PokemonTyp, PokemonTyp?>): Double? {
    val innerKey1 = gegnerPokemon.first
    val innerKey2 = gegnerPokemon.second

    val outerMap = multiplikatoren[meinAngriff.typ]

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
    return null                  // Wenn einer der Schadensmultiplikatoren nicht gefunden wurde, wird null zurückgegeben
}



/*
In dieser Funktion werden die Werte meines und des Gegner_Pokemon verrechnet.
Das Ganze wird mit dem Schadenswert der Attacke multipliziert.
 */
fun verrechnung(meinAngriff: Int, gegnerVerteidigung: Int, schadensWertAttacke: Int): Int {
    val schaden = (meinAngriff / gegnerVerteidigung) * schadensWertAttacke

    return schaden
}






fun effektivitaet(meinPokemon: Pokemon, gegnerPokemon: Pokemon, schadensWertAttacke: PokemonAttacke): Double?{
    val schaden = verrechnung(meinPokemon.angriff, gegnerPokemon.verteidigung, schadensWertAttacke.schaden)

    println("Der Schaden beträgt: $schaden")

    val zufallsAttacke = meinPokemon.attacke.random()
    val multiplikator = damage(zufallsAttacke, Pair(gegnerPokemon.typ1, gegnerPokemon.typ2))

    println("Der Multiplikator beträgt $multiplikator")

    val effektivitaet = multiplikator?.times(schaden)

    println("Der Schaden des Angriffs beträgt $effektivitaet")

    return effektivitaet
}



fun attackenAuswahl(attacke: PokemonAttacke){

    println("Gib eine Nummer ein für die jeweilige Attacke." +
            "1 für")
    val input = readln().toInt()

    when(input){
        1 -> attacke[PokemonAttacke]
    }


}