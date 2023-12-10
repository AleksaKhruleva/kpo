import dependencyInversionPrinciple.better_Implementation.Emailer
import dependencyInversionPrinciple.better_Implementation.Phone
import dependencyInversionPrinciple.better_Implementation.WeatherTracker
import interfaceSegregationPrinciple.better_Implementation.Eagle
import interfaceSegregationPrinciple.better_Implementation.Penguin
import openClosedPrinciple.better_Implementation.*


fun main(args: Array<String>) {
    // ЗАДАНИЕ 1: Приветствие
    val greeting1: EmailGreeting = formalEmailGreeting()
    val greeting2: EmailGreeting = casualEmailGreeting()
    val greeting3: EmailGreeting = intimateEmailGreeting()
    val greeting4: EmailGreeting = basicEmailGreeting()

    val greets = mutableListOf<EmailGreeting>()
    greets.add(greeting1)
    greets.add(greeting2)
    greets.add(greeting3)
    greets.add(greeting4)

    for (greet in greets) {
        println(greet.greeting)
    }

    // ЗАДАНИЕ 2: Уведомления о погоде
    val tracker = WeatherTracker(phone = Phone(), emailer = Emailer(), conditions = "sunny")

    // let's get a phone notification
    tracker.setCurrentConditions("rainy")

    // ЗАДАНИЕ 3: Птицы бывают разные (но не все всё умеют)
    val eagle = Eagle(150)
    eagle.fly()

    val penguin = Penguin(0)
    penguin.swim()
}