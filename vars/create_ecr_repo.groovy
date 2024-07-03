def call() {
  sh """
    echo this is Create ECR REpo stage.
    echo ${var_00}
    echo ${var_01}
    echo ${var_02}
  """    
}
