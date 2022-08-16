package support.utils

object Environments {

    fun getEnvironment(): String? {
            var environments = System.getProperty("environment")
            if (environments == null) {
                environments = "local"
            }
            return environments
        }
}