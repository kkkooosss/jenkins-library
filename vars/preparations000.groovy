def call() {
  sh "echo this is Preporation stage 000."
  sh "export var_00=10000"
  sh "export var_01=20000"
  sh "export var_02=30000"
  sh "echo ${var_00}"
  sh "echo ${var_01}"
  sh "echo ${var_02}"
}
