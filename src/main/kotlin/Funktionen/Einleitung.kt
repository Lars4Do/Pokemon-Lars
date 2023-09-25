package Funktionen

import Spieler.Player

fun einleitung(){


    val spieler1 = Player()
    val spieler2 = Player()


    println("Spieler 1, bitte gib deinen Namen ein")
    spieler1.name = readln()
    println("Du bist also ${spieler1.name}.\n" +
            "Spieler 2, du bist dran, wie heißt du?")
    spieler2.name = readln()
    println("Das ist kein sehr schöner Name...")
    Thread.sleep(5000)
    println("Naja, machen wir weiter.")
    Thread.sleep(2000)
    println("Das sind die 3 Teams aus denen Ihr eines wählen könnt.")
    Thread.sleep(3000)
    println(teamInformation())
    println("Nun wählt der Reihe nach ein Team aus.")
    Thread.sleep(3000)
    spieler1.team = teamAuswahlSpieler(spieler1)
    Thread.sleep(3000)
    spieler2.team = teamAuswahlSpieler(spieler2)
}