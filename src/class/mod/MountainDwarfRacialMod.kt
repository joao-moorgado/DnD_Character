package `class`.mod

class MountainDwarfRacialMod(var ability: Array<Int>) : RacialMod {
    override fun modAbility() {
        ability[0] += 2
        ability[2] += 2
    }
}