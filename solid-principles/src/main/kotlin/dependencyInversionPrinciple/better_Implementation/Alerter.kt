package dependencyInversionPrinciple.badImplementation

interface Alerter {
    fun generateWeatherAlert(weatherConditions: String): String
}