import groovy.json.JsonOutput
def call() {
	def var_00 = "0"
	def var_01 = "0"
	def var_02 = "0"
	def var_03 = "3333"
	pipeline {
		agent {
			label 'linux'
		}
	}
	stages {
		stage ("Preparations"){
			steps {
				script {
					if (${env.var_00}="000")
					   preparations000.groovy()
					else if(${env.var_01}="111")
					   preparations001.groovy
					else if(${env.var_01}="222")
					   preparations002.groovy
					else
					   preparations004.groovy
				}
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

