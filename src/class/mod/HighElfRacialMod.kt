package `class`.mod

class HighElfRacialMod(var ability: Array<Int>) : RacialMod {
    override fun modAbility() {
        ability[1] += 2
        ability[3] += 1
    }
}