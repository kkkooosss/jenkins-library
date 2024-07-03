def call() {
  sh "echo this is Preporation stage 000."
  sh "export var-00=10000"
  sh "export var-01=20000"
  sh "export var-02=30000"
  sh "echo ${var-00}"
  sh "echo ${var-01}"
  sh "echo ${var-02}"
}
