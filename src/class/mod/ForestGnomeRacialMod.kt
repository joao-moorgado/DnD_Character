package `class`.mod

class ForestGnomeRacialMod(var ability: Array<Int>) : RacialMod {
    override fun modAbility() {
        ability[1] += 1
        ability[3] += 2
    }
}