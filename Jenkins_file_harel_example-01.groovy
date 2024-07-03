import groovy.json.JsonOutput
def call() {
	def var_01 = "0"
	def var_02 = "0"
	def var_03 = "0"
	pipeline {
		agent {
			label 'linux'
		}
	}
	    environment {
        var_01 = "${params.VAR_01 ?: '0'}"
        var_02 = "${params.VAR_02 ?: '0'}"
		var_03 = "${params.VAR_02 ?: '0'}"
    }
	stages {
		stage ("Preparations"){
			steps {
				script {
                    preparations000.groovy()
			}
		}
		stage ("Create ECR REPO if not exist"){
			steps {
				script {
                    create_ecr_repo.groovy()
				}
			}
		}

	}	
}

