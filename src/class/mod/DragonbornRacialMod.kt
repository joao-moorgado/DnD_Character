package `class`.mod

class DragonbornRacialMod(var ability: Array<Int>) : RacialMod {
    override fun modAbility() {
        ability[0] += 2
        ability[5] += 1
    }
}