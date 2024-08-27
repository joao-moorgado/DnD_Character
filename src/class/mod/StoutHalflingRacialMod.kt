package `class`.mod

class StoutHalflingRacialMod(var ability: Array<Int>) : RacialMod {
    override fun modAbility() {
        ability[1] += 2
        ability[2] += 1
    }
}