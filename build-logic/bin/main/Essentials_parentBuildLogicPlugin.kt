/**
 * Precompiled [essentials.parent-build-logic.gradle.kts][Essentials_parent_build_logic_gradle] script plugin.
 *
 * @see Essentials_parent_build_logic_gradle
 */
public
class Essentials_parentBuildLogicPlugin : org.gradle.api.Plugin<org.gradle.api.Project> {
    override fun apply(target: org.gradle.api.Project) {
        try {
            Class
                .forName("Essentials_parent_build_logic_gradle")
                .getDeclaredConstructor(org.gradle.api.Project::class.java, org.gradle.api.Project::class.java)
                .newInstance(target, target)
        } catch (e: java.lang.reflect.InvocationTargetException) {
            throw e.targetException
        }
    }
}
