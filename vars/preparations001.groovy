def call(String name, String dayOfWeek) {
  sh "echo this is Preporation stage 001."
  sh "export var_00=11111"
  sh "export var_01=21111"
  sh "export var_02=31111"
  sh "echo ${var_00}"
  sh "echo ${var_01}"
  sh "echo ${var_02}"
}
