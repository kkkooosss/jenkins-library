def call(String name, String dayOfWeek) {
  sh "echo this is Preporation stage 001."
  sh "export var-00=11111"
  sh "export var-01=21111"
  sh "export var-02=31111"
  sh "echo ${var-00}"
  sh "echo ${var-01}"
  sh "echo ${var-02}"
}
