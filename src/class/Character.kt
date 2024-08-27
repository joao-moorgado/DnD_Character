package `class`

import `class`.mod.RacialMod

open class Character (var name: String, var ability: Array<Int>, var racMod : RacialMod, var life: Int, var race: Int){

    fun racialMod(){
        this.racMod.modAbility()
    }

    fun life_calculator() {
        var mod = 0

        when (ability[2]) {
            8 or 9 -> mod = (-1)
            12 or 13 -> mod = 1
            14 or 15 -> mod = 2
            16 or 17 -> mod = 3
            18 or 19 -> mod = 4
            20 -> 5
            else -> mod = 0
        }

        this.life = 10 + mod
    }
}