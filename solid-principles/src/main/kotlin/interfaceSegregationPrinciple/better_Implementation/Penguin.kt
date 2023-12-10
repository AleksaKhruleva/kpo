package interfaceSegregationPrinciple.better_Implementation

class Penguin(private var numberOfFeathers: Int): FeathersLosable, Swimable {
    private var currentLocation: String? = null

    override fun loseFeathers() {
        numberOfFeathers -= 1
    }

    override fun swim() {
        currentLocation = "in the water"
    }
}