import groovy.json.JsonOutput
def call() {
	pipeline {
		agent {
			label 'linux'
		}
	}
	    environment {
            var_00 = "${params.VAR_00 ?: '000'}"	
			var_01 = "${params.VAR_01 ?: '0'}"
			var_02 = "${params.VAR_02 ?: '0'}"
			var_03 = "${params.VAR_02 ?: '0'}"
    }
	stages {
		stage ("Preparations"){
			steps {
				script {
                    preparations000()

			    sh """
					echo this is Create ECR REpo stage.
					echo ${var_00}
					echo ${var_01}
					echo ${var_02}
				"""  
				}

		}
		stage ("Create ECR REPO if not exist"){
			steps {
				script {
                    create_ecr_repo(env.var_00, env.var_01, env.var_02)
				}
			}
		}

	}	
}

