import org.gradle.api.*

class GradleUtilPlugin implements Plugin<Project> {
    void apply(Project project) {
        project.ext.prop = { name, defaultValue ->
                                project.hasProperty(name) ? project[name] : defaultValue
                            }
   }
}