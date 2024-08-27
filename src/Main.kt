import `class`.Character
import `class`.mod.*

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    print("Write the name of your character: ")
    var name = readLine().toString()

    var ability = ability_points_distribution()
    var race = race_choice()
    var racMod : RacialMod
    var life = 10

    if (race == 11) {
        racMod = HillDwarfRacialMod(ability)
    } else if (race == 12) {
        racMod = MountainDwarfRacialMod(ability)
    } else if (race == 21) {
        racMod = HighElfRacialMod(ability)
    } else if (race == 22) {
        racMod = WoodElfRacialMod(ability)
    } else if (race == 23) {
        racMod = DarkElfRacialMod(ability)
    } else if (race == 31) {
        racMod = LightfootHalflingRacialMod(ability)
    } else if (race == 32) {
        racMod = StoutHalflingRacialMod(ability)
    } else if (race == 5) {
        racMod = DragonbornRacialMod(ability)
    } else if (race == 61) {
        racMod = ForestGnomeRacialMod(ability)
    } else if (race == 62) {
        racMod = RockGnomeRacialMod(ability)
    } else if (race == 7) {
        racMod = HalfElfRacialMod(ability)
    } else if (race == 8) {
        racMod = HalfOrcRacialMod(ability)
    } else if (race == 9) {
        racMod = TieflingRacialMod(ability)
    }  else {
        racMod = HumanRacialMod(ability)
    }

    var newCharacter = Character(name, ability, racMod ,life, race)
    newCharacter.racialMod()
    newCharacter.life_calculator()

    print("\n\n############## CHARACTER  ##################\n\n")
    print("Name: ")
    print(newCharacter.name)
    print("     ")
    print("Life: ")
    println(newCharacter.life)
    newCharacter.ability.forEach { index -> println(index) }
    // println(newCharacter.race.toString())

}

fun ability_points_distribution() : Array<Int> {

    var n0 : Int
    var n1 : Int
    var n2 : Int
    var n3 : Int
    var n4 : Int
    var n5 : Int

    var n : Int
    var points = 27
    var choose = 'X'

    print("\n#########################################################################\n" +
            "You have 27 points to distribute between your abilities. They currently look like this:\n\n" +
            "Strength:     8\n" +
            "Dextery:      8\n" +
            "Constitution: 8\n" +
            "Intelligence: 8\n" +
            "Wisdom:       8\n" +
            "Charisma:      8\n" +
            "\n" +
            "To level them up, it has a cost, which is:\n" +
            "Value / Cost      Value / Cost\n" +
            "  8   -   0        12   -   4\n" +
            "  9   -   1        13   -   5\n" +
            " 10   -   2        14   -   7\n" +
            " 11   -   3        15   -   9\n\n" +
            "Knowing this, what value do you want to assign to Strength (enter the final value, not how much you want to add)? ")

    n = readLine().toString().toInt()

    while (choose != 'O') {
        if (n > 15 || n < 8) {
            print("Invalid value. Type again: ")
            n = readLine().toString().toInt()
        } else if ((ability_points_decreaser(n, points)) < 0) {
            print("Insufficient points. TYpe again: ")
            n = readLine().toString().toInt()
        } else {
            println("Your Strength will be: " + n + "\n" +
                    "Confirm?    O - Yes         X - No")
            choose = readLine().toString().single()
        }
    }

    n0 = n
    points = ability_points_decreaser(n, points)
    choose = 'X'

    print("what value do you want to assign to Dextery? ")
    n = readLine().toString().toInt()

    while (choose != 'O') {
        if (n > 15 || n < 8) {
            print("Invalid value. Type again: ")
            n = readLine().toString().toInt()
        } else if ((ability_points_decreaser(n, points)) < 0) {
            print("Insufficient points. TYpe again: ")
            n = readLine().toString().toInt()
        } else {
            println("Your Dextery will be: " + n + "\n" +
                    "Confirm?    O - Yes         X - No")
            choose = readLine().toString().single()
        }
    }

    n1 = n
    points = ability_points_decreaser(n, points)
    choose = 'X'

    print("what value do you want to assign to Constitution? ")
    n = readLine().toString().toInt()

    while (choose != 'O') {
        if (n > 15 || n < 8) {
            print("Invalid value. Type again: ")
            n = readLine().toString().toInt()
        } else if ((ability_points_decreaser(n, points)) < 0) {
            print("Insufficient points. TYpe again: ")
            n = readLine().toString().toInt()
        } else {
            println("Your Constitution will be: " + n + "\n" +
                    "Confirm?    O - Yes         X - No")
            choose = readLine().toString().single()
        }
    }

    n2 = n
    points = ability_points_decreaser(n, points)
    choose = 'X'

    print("what value do you want to assign to Intelligence? ")
    n = readLine().toString().toInt()

    while (choose != 'O') {
        if (n > 15 || n < 8) {
            print("Invalid value. Type again: ")
            n = readLine().toString().toInt()
        } else if ((ability_points_decreaser(n, points)) < 0) {
            print("Insufficient points. TYpe again: ")
            n = readLine().toString().toInt()
        } else {
            println("Your Intelligence will be: " + n + "\n" +
                    "Confirm?    O - Yes         X - No")
            choose = readLine().toString().single()
        }
    }

    n3 = n
    points = ability_points_decreaser(n, points)
    choose = 'X'

    print("what value do you want to assign to Wisdom? ")
    n = readLine().toString().toInt()

    while (choose != 'O') {
        if (n > 15 || n < 8) {
            print("Invalid value. Type again: ")
            n = readLine().toString().toInt()
        } else if ((ability_points_decreaser(n, points)) < 0) {
            print("Insufficient points. TYpe again: ")
            n = readLine().toString().toInt()
        } else {
            println("Your Wisdom will be: " + n + "\n" +
                    "Confirm?    O - Yes         X - No")
            choose = readLine().toString().single()
        }
    }

    n4 = n
    points = ability_points_decreaser(n, points)
    choose = 'X'

    print("what value do you want to assign to Charisma? ")
    n = readLine().toString().toInt()

    while (choose != 'O') {
        if (n > 15 || n < 8) {
            print("Invalid value. Type again: ")
            n = readLine().toString().toInt()
        } else if ((ability_points_decreaser(n, points)) < 0) {
            print("Insufficient points. TYpe again: ")
            n = readLine().toString().toInt()
        } else {
            println("Your Charisma will be: " + n + "\n" +
                    "Confirm?    O - Yes         X - No")
            choose = readLine().toString().single()
        }
    }

    n5 = n
    points = ability_points_decreaser(n, points)
    choose = 'X'

    return arrayOf(n0, n1, n2, n3, n4, n5)

}

fun ability_points_decreaser(n : Int, points : Int): Int {
    var final_points : Int
    when (n) {
        8 -> final_points = points
        9 -> final_points = points - 1
        10 -> final_points = points - 2
        11 -> final_points = points - 3
        12 -> final_points = points - 4
        13 -> final_points = points - 5
        14 -> final_points = points - 7
        15 -> final_points = points - 9
        else -> final_points = points
    }

    return final_points
}

fun race_choice() : Int {

    var n : Int
    var choose = 'X'
    var race_name = "Human"

    print("\n#########################################################################\n" +
            "Now you have to choose the race of your character. All of them have racial modifiers, that you change your value abilities. The races are:\n" +
            "1 - Dwarf      | CON +2\n" +
            "2 - Elf        | DEX +2\n" +
            "3 - Halfling   | DEX +2\n" +
            "4 - Human      | ALL +1\n" +
            "5 - Dragonborn | FOR +2 CHA +1\n" +
            "6 - Gnome      | INT +2\n" +
            "7 - Half-Elf   | CHA +2\n" +
            "8 - Half-Orc   | STR +2 CON +1\n" +
            "9 - Tiefling   | CHA +2 INT +1\n" +
            "Knowing this, choose your race: ")
    n = readLine().toString().toInt()

    while (choose != 'O'){
        if (n == 4 || n == 5 || n == 8 || n == 9) {
            when (n) {
                4 -> race_name = "Human"
                5 -> race_name = "Dragonborn"
                8 -> race_name = "Half-Orc"
                9 -> race_name = "Tiefling"
            }
        } else if (9 >= n || n > 0) {

            print("You selected a race that has variants:\n")

            if (n == 1) {

                println("1 - Hill Dwarf     | CON +2 WILL +1\n" +
                        "2 - Mountain Dwarf | STR +2 CON +2")

                n = readLine().toString().toInt()
                if (n == 1) {
                    n = 11
                    race_name = "Hill Darf"
                }
                if (n == 2) {
                    n = 12
                    race_name = "Mountain Darf"
                }
            }
            if (n == 2) {
                println("1 - High Elf | DEX +2 INT +1\n" +
                        "2 - Wood Elf | DEX +2 WIS +1\n" +
                        "3 - Dark Elf | DEX +2 CHA +1")

                n = readLine().toString().toInt()
                if (n == 1) {
                    n = 21
                    race_name = "High Elf"
                }
                if (n == 2) {
                    n = 22
                    race_name = "Wood Elf"
                }
                if (n == 3) {
                    n = 23
                    race_name = "Dark Elf"
                }
            }
            if (n == 3) {
                println("1 - Lighfoot Halfling | DEX +2 CHA +1\n" +
                        "2 - Stout Halfling    | DEX +2 CON +1")

                n = readLine().toString().toInt()
                if (n == 1) {
                    n = 31
                    race_name = "Lighfoot Halfling"
                }
                if (n == 2) {
                    n = 32
                    race_name = "Stout Halfling"
                }
            }
            if (n == 6) {
                println("1 - Forest Gnome | DEX +1 INT +2\n" +
                        "2 - Rock Gnome   | CON +1 INT +2")

                n = readLine().toString().toInt()
                if (n == 1) {
                    n = 61
                    race_name = "Forest Gnome"
                }
                if (n == 2) {
                    n = 62
                    race_name = "Rock Gnome"
                }
            }
            if (n == 7) {
                println("As an Half-Elf, you can choose one ability to add +1, choose it:" +
                        "1 - Strength       4 - Intelligence" +
                        "2 - Dextery        5 - Wisdom" +
                        "3 - Constitution   6 - Charisma")

                n = readLine().toString().toInt()
                race_name = "Half-Elf"
            }

        } else {
            print("Invalid valor, select again: ")
            n = readLine().toString().toInt()
        }

        print("You have selected " + race_name + ", is that corret?\n" +
                "O - Yes         X - No" +
                "\n" +
                "")
        choose = readLine().toString().single()
    }

    return n


}