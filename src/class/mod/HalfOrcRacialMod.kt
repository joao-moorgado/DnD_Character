package `class`.mod

class HalfOrcRacialMod(var ability: Array<Int>) : RacialMod {
    override fun modAbility() {
        ability[0] += 2
        ability[2] += 1
    }
}