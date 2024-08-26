package `class`

open class Character (val name: String, var ability: Array<Int>, val race: Int){

    fun ability_points_distribution() {

        var n : Int
        var points = 27
        var choose = 'X'

        print("\n#########################################################################\n" +
                "You have 27 points to distribute between your abilities. They currently look like this:\n\n" +
                "Strenght:     8\n" +
                "Dextery:      8\n" +
                "Constitution: 8\n" +
                "Intelligence: 8\n" +
                "Wisdom:       8\n" +
                "Charism:      8\n" +
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

        ability.set(0, n)
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

        ability.set(1, n)
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

        ability.set(2, n)
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

        ability.set(3, n)
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

        ability.set(4, n)
        points = ability_points_decreaser(n, points)
        choose = 'X'

        print("what value do you want to assign to Charism? ")
        n = readLine().toString().toInt()

        while (choose != 'O') {
            if (n > 15 || n < 8) {
                print("Invalid value. Type again: ")
                n = readLine().toString().toInt()
            } else if ((ability_points_decreaser(n, points)) < 0) {
                print("Insufficient points. TYpe again: ")
                n = readLine().toString().toInt()
            } else {
                println("Your Charism will be: " + n + "\n" +
                        "Confirm?    O - Yes         X - No")
                choose = readLine().toString().single()
            }
        }

        ability.set(5, n)
        points = ability_points_decreaser(n, points)
        choose = 'X'

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

}