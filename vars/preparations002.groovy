def call(String name, String dayOfWeek) {
  sh "echo this is Preporation stage 2222."
  sh "export var-00=12222"
  sh "export var-01=22222"
  sh "export var-02=32222"
  sh "echo ${var-00}"
  sh "echo ${var-01}"
  sh "echo ${var-02}"
}
