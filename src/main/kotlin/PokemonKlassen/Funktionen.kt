package PokemonKlassen
import multiplikatoren



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

fun schadensBerechnung(meinPokemon: Pokemon, gegnerPokemon: Pokemon, schadensWertAttacke: PokemonAttacke):Double?{


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
        val erlittenerSchaden = gegnerPokemon.kp - speziellerGesamtSchaden!!
        println("${gegnerPokemon.name} hat noch $erlittenerSchaden Kp.")

        return speziellerGesamtSchaden
    }
    else{
        val physischerSchaden = satatusWertBerechnung(meinPokemon.angriff, gegnerPokemon.verteidigung, schadensWertAttacke.schaden)
        println("Der Schaden beträgt: ${schadensWertAttacke.schaden}")
        val multiplikator = typenMultiplikator(schadensWertAttacke, gegnerPokemon)
        println("Der Multiplikator beträgt $multiplikator")
        val physischerGesamtSchaden = multiplikator?.times(physischerSchaden)
        println("Der Schaden des Angriffs beträgt $physischerGesamtSchaden")

        val erlittenerSchaden = gegnerPokemon.kp - physischerGesamtSchaden!!
        println("${gegnerPokemon.name} hat noch $erlittenerSchaden Kp.")

        return physischerGesamtSchaden

    }

}





/*
Eine Funktion die in der Konsole ausgibt welche Angriffe verfügbar sind und den Nutzer
um eine Eingabe zur Attackenauswahl bittet.
*/

fun attackenAuswahl(pokemon: Pokemon){


    println("Gib eine Nummer ein für die jeweilige Attacke.")

    var zahl: Int = 1
    for (attacke in pokemon.attacke){
        print(1)
        println("für $attacke")
        zahl++
    }
    val input = readln().toInt()-1

    when(input){
        1 -> pokemon.attacke[0]
        2 -> pokemon.attacke[1]
        3 -> pokemon.attacke[2]
        4 -> pokemon.attacke[3]
        else ->{ println("ungültig")
        attackenAuswahl(pokemon)}
    }

    println("$pokemon setzt ${pokemon.attacke} ein")
}




fun ausgeteilterSchaden(gegnerKp: Pokemon, schadenAttacke: Double):Double{
    val angriff = gegnerKp.kp - schadenAttacke
    return angriff
}




