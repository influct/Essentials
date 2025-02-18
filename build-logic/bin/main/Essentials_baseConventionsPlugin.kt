/**
 * Precompiled [essentials.base-conventions.gradle.kts][Essentials_base_conventions_gradle] script plugin.
 *
 * @see Essentials_base_conventions_gradle
 */
public
class Essentials_baseConventionsPlugin : org.gradle.api.Plugin<org.gradle.api.Project> {
    override fun apply(target: org.gradle.api.Project) {
        try {
            Class
                .forName("Essentials_base_conventions_gradle")
                .getDeclaredConstructor(org.gradle.api.Project::class.java, org.gradle.api.Project::class.java)
                .newInstance(target, target)
        } catch (e: java.lang.reflect.InvocationTargetException) {
            throw e.targetException
        }
    }
}
