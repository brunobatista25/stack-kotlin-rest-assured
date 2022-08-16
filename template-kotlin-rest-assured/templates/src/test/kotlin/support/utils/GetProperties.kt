package support.utils


import support.utils.Environments.getEnvironment
import java.util.Properties
import java.io.FileInputStream
import java.io.IOException

object GetProperties {
    private const val DATA_CONFIG = "src/test/resources/"
    private var properties: Properties? = null

    fun getProp(value: String?): String {
        try {
            if (properties == null) {
                properties = Properties()
                properties!!.load(FileInputStream(DATA_CONFIG + getEnvironment() + ".properties"))
            }
        } catch (e: IOException) {
            e.printStackTrace()
        }
        return properties!!.getProperty(value)
    }
}