package interfaceSegregationPrinciple.better_Implementation

class Eagle(private var numberOfFeathers: Int): FeathersLosable, Flyable {
    private var currentLocation: String? = null

    override fun loseFeathers() {
        numberOfFeathers -= 1
    }

    override fun fly() {
        currentLocation = "in the air"
    }
}