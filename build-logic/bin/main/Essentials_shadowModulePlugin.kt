/**
 * Precompiled [essentials.shadow-module.gradle.kts][Essentials_shadow_module_gradle] script plugin.
 *
 * @see Essentials_shadow_module_gradle
 */
public
class Essentials_shadowModulePlugin : org.gradle.api.Plugin<org.gradle.api.Project> {
    override fun apply(target: org.gradle.api.Project) {
        try {
            Class
                .forName("Essentials_shadow_module_gradle")
                .getDeclaredConstructor(org.gradle.api.Project::class.java, org.gradle.api.Project::class.java)
                .newInstance(target, target)
        } catch (e: java.lang.reflect.InvocationTargetException) {
            throw e.targetException
        }
    }
}
