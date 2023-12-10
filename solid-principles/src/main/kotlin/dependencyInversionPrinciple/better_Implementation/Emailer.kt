package dependencyInversionPrinciple.better_Implementation

class Emailer: Alerter {
    override fun generateWeatherAlert(weatherConditions: String): String {
        return "Email: It is $weatherConditions"
    }
}