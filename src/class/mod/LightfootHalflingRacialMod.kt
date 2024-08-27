package `class`.mod

class LightfootHalflingRacialMod(var ability: Array<Int>) : RacialMod {
    override fun modAbility() {
        ability[1] += 2
        ability[5] += 1
    }
}