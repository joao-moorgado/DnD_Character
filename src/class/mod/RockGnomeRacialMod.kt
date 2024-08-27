package `class`.mod

class RockGnomeRacialMod(var ability: Array<Int>) : RacialMod {
    override fun modAbility() {
        ability[3] += 2
        ability[2] += 1
    }
}