package PokemonKlassen

fun teamBisaflor(){

    val bisaflor = Bisaflor()
    val kokowei = Kokowei()
    val elezard = Elezard()
    val groudon = Groudon()
    var Team3 = mutableListOf(bisaflor, kokowei, elezard, groudon)

    return println("$bisaflor \n$kokowei \n$elezard \n$groudon")
}


fun teamGlurak() {
    val glurak = Glurak()
    val entei = Entei()
    val elfun = Elfun()
    val qurtel = Qurtel()
    var Team1 = mutableListOf(glurak, entei, qurtel, elfun)

    return println("$glurak \n$entei \n$elfun \n$qurtel")
}



fun teamTurtok() {
    val turtok = Turtok()
    val pelipper = Pelipper()
    val seedraking = Seedraking()
    val zapdos = Zapdos()
    var Team2 = mutableListOf(turtok, pelipper, seedraking, zapdos)

    return println("$turtok \n$pelipper \n$seedraking \n$zapdos")
}



fun teamInformation(){
    println("Das erste Team besteht aus:")
    teamGlurak()
    println("Es ist ein Sonnentag-Team.")


    readln()

    println("Das zweite Team besteht aus:")
    teamTurtok()
    println("Es ist ein Regentanz-Team.")


    readln()

    println("Das dritte Team besteht aus:")
    teamBisaflor()
    println("Es ist ebenfalls ein Sonnentag-Team.")
}
