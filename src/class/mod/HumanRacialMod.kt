package `class`.mod

class HumanRacialMod(var ability: Array<Int>) : RacialMod {
    override fun modAbility() {
        ability[0] += 1
        ability[1] += 1
        ability[2] += 1
        ability[3] += 1
        ability[4] += 1
        ability[5] += 1
    }
}