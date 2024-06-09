def call() {
  sh "echo this is Preporation stage."
  loadLinuxScript(name: 'script02.sh')
  sh "./script02.sh"
}
