package pokemonKlassen

import enumKlassenTypenUndAttacken.PokemonTyp
import enumKlassenTypenUndAttacken.PokemonAttacke

open class Pokemon (
    var name: String,
    var typ1: PokemonTyp,
    var typ2: PokemonTyp?,
    val level: Int,
    var attacke: MutableList<PokemonAttacke>,
    var kp: Double,
    var angriff: Int,
    var verteidigung: Int,
    var spezialAngriff: Int,
    var spezialverteidigung: Int,
    var initiative: Int){

    override fun toString(): String {
        return "${this.name}, ${this.level}." +
                " Seine Angriffe sind ${this.attacke}."
    }
}


