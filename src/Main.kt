import `class`.Character

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    print("Write the name of your character: ")
    var name = readLine().toString()

    var ability = arrayOf(8, 8, 8, 8, 8, 8)

    println("1 - Dwarf      | CON +2\n" +
            "2 - Elf        | DEX +2\n" +
            "3 - Halfling   | DEX +2\n" +
            "4 - Human      | ALL +1\n" +
            "5 - Dragonborn | FOR +2 CHA +1\n" +
            "6 - Gnome      | INT +2\n" +
            "7 - Half-Elf   | CHA +2\n" +
            "8 - Half-Orc   | STR +2 CON +1\n" +
            "9 - Tiefling   | CHA +2 INT +1")
    print("Select your race: ")
    var race = readLine().toString().toInt()

    if (race == 4 or 5 or 8 or 9) {

    }

    var newCharacter = Character(name, ability, race)

    newCharacter.ability_points_distribution()

    println(newCharacter.name)
    newCharacter.ability.forEach { index -> println(index) }
    println(newCharacter.race.toString())

}