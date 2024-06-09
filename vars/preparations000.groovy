def call() {
  sh "echo this is Preporation stage."
  loadLinuxScript(name: 'script01.sh')
  sh "./script01.sh"
}

