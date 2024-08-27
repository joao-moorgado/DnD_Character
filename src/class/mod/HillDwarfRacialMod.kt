package `class`.mod

class HillDwarfRacialMod(var ability: Array<Int>) : RacialMod {
    override fun modAbility() {
        ability[2] += 2
        ability[4] += 1
    }
}