package `class`.mod

class DarkElfRacialMod(var ability: Array<Int>) : RacialMod {
    override fun modAbility() {
        ability[1] += 2
        ability[5] += 1
    }
}