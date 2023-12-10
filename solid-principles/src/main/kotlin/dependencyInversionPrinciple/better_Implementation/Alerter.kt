package dependencyInversionPrinciple.better_Implementation

interface Alerter {
    fun generateWeatherAlert(weatherConditions: String): String
}