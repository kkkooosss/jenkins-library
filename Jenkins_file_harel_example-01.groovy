import groovy.json.JsonOutput
def call() {
	def var_00 = "0"
	def var_01 = "0"
	def var_02 = "0"
	def var_03 = "0"
	pipeline {
		agent {
			label 'linux'
		}
	}
	stages {
		stage ("Preparations"){
			steps {
				script {
                    preparations000()
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

