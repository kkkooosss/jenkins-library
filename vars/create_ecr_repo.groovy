def call(String var_01, String var_02, String var_03) {
  sh """
    echo this is Create ECR REpo stage.
    echo ${var_01}
    echo ${var_02}
    echo ${var_03}
  """    
}
