abstract class AquariumFish {
    abstract val color: String
}

class Shank() : AquariumFish(), FishAction {
    override val color = "gray"
    override fun eat() {
        println("Hunt and eat fish")
    }
}

class Plecostomus: AquariumFish(), FishAction {
    override val color = "gold"
    override fun eat() {
        println("eat algae")
    }
}

interface FishAction {
    fun eat()
}