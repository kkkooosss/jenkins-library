def call() {
  sh "echo this is Preporation stage."
  loadLinuxScript(name: 'script03.sh')
  sh "./script03.sh"
}
