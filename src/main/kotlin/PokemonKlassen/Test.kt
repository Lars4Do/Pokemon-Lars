package PokemonKlassen

import PokemonTyp
/*import damage
import effektivitaet
import verrechnung*/
import kotlin.time.times


fun main() {


    val turtok = Turtok()

    var zahl: Int = 1
    for (attacke in turtok.attacke){
        println("$zahl für $attacke")
        zahl++
    }
    val input = readln().toInt()-1

    when(input){
        1 -> turtok.attacke[0]
        2 -> turtok.attacke[1]
        3 -> turtok.attacke[2]
        4 -> turtok.attacke[3]
        else -> println("Bitte gib eine gültige Zahl ein")
    }

    println(turtok.attacke[input])

    /*     val schaden = damage(PokemonTyp.FEUER, Pair(PokemonTyp.PFLANZE, PokemonTyp.EIS))

        if (schaden != null) {
            println("Schaden: $schaden")
        } else {
            println("Schadensmultiplikatoren nicht gefunden.")
        }
*/

}








