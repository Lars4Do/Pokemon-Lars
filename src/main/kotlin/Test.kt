import Funktionen.einleitung
import Funktionen.schadensBerechnung
import pokemonKlassen.Groudon
import pokemonKlassen.Zapdos

/*import damage
import effektivitaet
import verrechnung*/


fun main() {



    einleitung()



    readln()
    val turtok = Zapdos()
    val glurak = Groudon()
    schadensBerechnung(glurak, turtok, glurak.attacke.random())



}







