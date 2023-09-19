package PokemonKlassen

fun teamBisaflor():MutableList<Pokemon>{

    val bisaflor = Bisaflor()
    val kokowei = Kokowei()
    val elezard = Elezard()
    val groudon = Groudon()
    var team3 = mutableListOf(bisaflor, kokowei, elezard, groudon)

    println("$bisaflor \n$kokowei \n$elezard \n$groudon")

    return team3
}


fun teamGlurak() :MutableList<Pokemon>{
    val glurak = Glurak()
    val entei = Entei()
    val elfun = Elfun()
    val qurtel = Qurtel()
    var team1 = mutableListOf(glurak, entei, qurtel, elfun)

    println("$glurak \n$entei \n$elfun \n$qurtel")

    return team1
}



fun teamTurtok() :MutableList<Pokemon>{
    val turtok = Turtok()
    val pelipper = Pelipper()
    val seedraking = Seedraking()
    val zapdos = Zapdos()
    var team2 = mutableListOf(turtok, pelipper, seedraking, zapdos)

    println("$turtok \n$pelipper \n$seedraking \n$zapdos")

    return team2
}



fun teamInformation(){
    println("Das erste Team besteht aus:")
    teamTurtok()
    println("Es ist ein Sonnentag-Team.")


    readln()

    println("Das zweite Team besteht aus:")
    teamGlurak()
    println("Es ist ein Regentanz-Team.")


    readln()

    println("Das dritte Team besteht aus:")
    teamBisaflor()
    println("Es ist ebenfalls ein Sonnentag-Team.")
}
