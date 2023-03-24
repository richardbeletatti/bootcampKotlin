import decor.Decoration

fun buildAquarium() {
    val myAquarium = Aquarium(width = 25, height = 35, length = 110)
    myAquarium.printSize()

    println()

    val myTower = TowerTank(diameter = 25, height = 40)
    myTower.printSize()
}

fun makeFish() {
    val shark = Shank()
    val pleco = Plecostomus()

    println("Shark: ${shark.color}")
    shark.eat()
    println("")
    println("Plecostomus: ${pleco.color}")
    pleco.eat()
}

fun main() {
    buildAquarium()
    println("")
    makeFish()
}