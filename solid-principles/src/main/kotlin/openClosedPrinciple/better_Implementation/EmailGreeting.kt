package openClosedPrinciple.better_Implementation

abstract class EmailGreeting {
    abstract val formality: String
    abstract val greeting: String
}

class formalEmailGreeting: EmailGreeting() {
    override val formality = "formal"
    override val greeting: String = "Good evening, sir."
}

class casualEmailGreeting: EmailGreeting() {
    override val formality = "casual"
    override val greeting: String = "Sup bro?"
}

class intimateEmailGreeting: EmailGreeting() {
    override val formality = "intimate"
    override val greeting: String = "Hello Darling!"
}

class basicEmailGreeting: EmailGreeting() {
    override val formality = "basic"
    override val greeting: String = "Hello!"
}
