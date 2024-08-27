package `class`.mod

class HalfElfRacialMod(var ability: Array<Int>) : RacialMod {
    override fun modAbility() {
        ability[5] += 2
    }
}