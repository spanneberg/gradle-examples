import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class GreetingTask extends DefaultTask {
  String greetingName = 'Welt'

  @TaskAction
  def greet() {
    println "Hallo ${greetingName}!"
  }
}
