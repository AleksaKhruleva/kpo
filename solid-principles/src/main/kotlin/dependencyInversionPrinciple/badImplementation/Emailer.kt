package dependencyInversionPrinciple.badImplementation

class Emailer: Alerter {
    override fun generateWeatherAlert(weatherConditions: String): String {
        return "Email: It is $weatherConditions"
    }
}