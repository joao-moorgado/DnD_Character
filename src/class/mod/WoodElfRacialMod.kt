package `class`.mod

class WoodElfRacialMod(var ability: Array<Int>) : RacialMod {
    override fun modAbility() {
        ability[1] += 2
        ability[4] += 1
    }
}