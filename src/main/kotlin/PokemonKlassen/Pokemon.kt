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
        return "${this.name}, ${this.typ}, ${this.level}, ${this.item}, ${this.fähigkeit}, ${this.attacke}" +
                "${this.kp}, ${this.angriff}, ${this.verteidigung}, ${this.spezialAngriff}" +
                "${this.spezialverteidigung}, ${this.initiative}"
    }
}