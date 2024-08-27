package `class`.mod

class TieflingRacialMod(var ability: Array<Int>) : RacialMod {
    override fun modAbility() {
        ability[5] += 2
        ability[3] += 1
    }
}