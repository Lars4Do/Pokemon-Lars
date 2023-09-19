package PokemonKlassen

open class Pokemon (
    var name: String,
    var typ: MutableList<String>,
    val level: Int,
    var item: String,
    var fähigkeit: String,
    var attacke: MutableList<String>,
    var kp: Int,
    var angriff: Int,
    var verteidigung: Int,
    var spezialAngriff: Int,
    var spezialverteidigung: Int,
    var initiative: Int){

    override fun toString(): String {
        var uebersicht: String = "${this.name}, ${this.typ}, ${this.level}, ${this.item}, ${this.fähigkeit}, ${this.attacke}" +
                "${this.kp}, ${this.angriff}, ${this.verteidigung}, ${this.spezialAngriff}," +
                "${this.spezialverteidigung}, ${this.initiative}"



        return "${this.name} vom Typ ${this.typ}." +
                "Es hat die Fähigkeit ${this.fähigkeit} und trägt das Item ${this.item}." +
                "Seine Angriffe sind ${this.attacke}."
    }
}