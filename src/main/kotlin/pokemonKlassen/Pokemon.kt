package pokemonKlassen

import PokemonTyp
import EnumKlassenTypenUndAttacken.PokemonAttacke

open class Pokemon (
    var name: String,
    var typ1: PokemonTyp,
    var typ2: PokemonTyp?,
    val level: Int,
    var item: String,
    var fähigkeit: String,
    var attacke: MutableList<PokemonAttacke>,
    var kp: Int,
    var angriff: Int,
    var verteidigung: Int,
    var spezialAngriff: Int,
    var spezialverteidigung: Int,
    var initiative: Int){

    override fun toString(): String {
        var uebersicht: String = "${this.name}, ${this.typ1}, ${this.typ2}, ${this.level}, ${this.item}, ${this.fähigkeit}, ${this.attacke}" +
                "${this.kp}, ${this.angriff}, ${this.verteidigung}, ${this.spezialAngriff}," +
                "${this.spezialverteidigung}, ${this.initiative}"



        return "${this.name} vom Typ ${this.typ1}, ${this.typ2}." +
                "Es hat die Fähigkeit ${this.fähigkeit} und trägt das Item ${this.item}." +
                "Seine Angriffe sind ${this.attacke}."
    }
}


