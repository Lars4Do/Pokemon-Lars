package funktionen
import enumKlassenTypenUndAttacken.multiplikatoren
import pokemonKlassen.Pokemon
import enumKlassenTypenUndAttacken.PokemonAttacke


/**
 * Diese Funktion sucht den Schadensmultiplikator aus der "EnumKlassenTypenUndAttacken.getMultiplikatoren".
 * Bei einem Gegner mit zwei Typen werden die Schadensmultiplikatoren auch direkt miteinander verrechnet.
 *
 * @param meinAngriff: Sucht in der Klasse PokemonAttacke den Typen den mein Angriff hat.(Key der äußeren Map.)
 * @param gegnerPokemon: Sucht in der Klasse PokemonAttacke den Typen des Gegners. (Key der inneren Map.)
 *                       Sollte der Gegner 2 Typen besitzen werden beide gesucht und miteinander multipliziert.
 * @return: Gibt den gesuchten bzw. errechneten Multiplikator zurück. Null wird benutzt, falls das Gegnerpokemon nur einen Typen besitzt.
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





/**
 * Diese Funktion dividiert den Angriffswert meines Pokemon mit der Verteidigung des Gegnerpokemon.
 * Das Ergebnis wird dann mit dem Schadenswert der Attacke multipliziert.
 *
 * @param meinAngriff: Gibt den Angriffswert meines Pokemon an.
 * @param gegnerVerteidigung: Gibt die Verteidigung des Gegnerpokemon an.
 * @param schadensWertAttacke: Liest den Schadenswert des Angriffs aus der Klasse PokemonAttacken aus.
 * @return: Gibt den errechneten Wert zurück.
 */

fun satatusWertBerechnung(meinAngriff: Int, gegnerVerteidigung: Int, schadensWertAttacke: Int): Double {
    val schaden = (meinAngriff.toDouble() / gegnerVerteidigung.toDouble()) * schadensWertAttacke.toDouble()

    return schaden
}





/**
 * Diese Funktion errechnet den ausgeteilten Schaden. Gleichzeitig wird hier der physisch/ speziell split eingebaut. (Angegeben in der Klasse PokemonAttacken)
 * Dazu wird der errechnete Schaden der Statuswerte aus der Funktion statusWertBerechnung mit dem Multiplikator aus der Funktion typenMultiplikator multipliziert.
 * Mit der if-Abfrage werden entweder die physischen oder speziellen Statuswerte verrechnet, je nachdem was bei den Attacken abgespeichert ist.
 *
 * @param meinPokemon: Hier wird angegeben welches Pokemon ich aktuell im Kampf habe, um die Statuswerte auszulesen.
 * @param gegnerPokemon: Hier wird angegeben welches Gegnerpokemon im Kampf ist, um dessen Statuswerte auszulesen.
 * @param schadensWertAttacke: Liest den Schadenswert des Angriffs meines Pokemons aus um alles verrechnen zu können.
 *
 * @return: Gibt den errechneten Gesamtschaden zurück. (Egal ob physisch oder speziell)
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








