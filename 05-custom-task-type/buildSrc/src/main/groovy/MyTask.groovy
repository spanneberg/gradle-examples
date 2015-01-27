import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class MyTask extends DefaultTask {
  String myProperty = 'Default Value'

  @TaskAction
  void doSomething() {
    println "myProperty: ${myProperty}"
  }
}
