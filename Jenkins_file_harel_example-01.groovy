import groovy.json.JsonOutput
def call() {
	def var-00 = "0"
	def var-01 = "0"
	def var-02 = "0"
	def var-03 = "3333"
	pipeline {
		agent {
			label 'linux'
		}
	}
	stages {
		stage ("Preparations"){
			steps {
				script {
					if (${env.var-00}="000")
					   preparations000.groovy()
					else if(${env.var-01}="111")
					   preparations001.groovy
					else if(${env.var-01}="222")
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

