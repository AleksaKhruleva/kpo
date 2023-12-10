package dependencyInversionPrinciple.better_Implementation

class Phone: Alerter {
    override fun generateWeatherAlert(weatherConditions: String): String {
        return "Phone: It is $weatherConditions"
    }
}