import groovy.json.JsonOutput
def call() {
	def var00 = "000"
	def var01 = "111"
	def var02 = "222"
	def var03 = "333"
	def var04 = "444"
	def var05 = "555"
	pipeline {
		agent {
			label 'linux'
		}
		// options {
		// 	disableConcurentBuilds()
		// 	gitLabConnection('GitLab')
		// 	buildDiscarder(logRotator(numToKeepStr: '15', artifactNumToKeepStr: '15'))
		// }
    parameters {
        string(name: 'name', defaultValue: 'Jenkins', description: 'Name of the person')
        string(name: 'dayOfWeek', defaultValue: 'Monday', description: 'Day of the week')
    }
	}
	stages {
		stage ("Preparations"){
			steps {
				script {
					if (${env.var00}="000")
					   preparations000()
					else if(${env.var01}="111")
					   preparations001()
					else if(${env.var02}="222")
					   preparations002()
					else
					   preparations004()
				}
			}
		}
		stage ("Create ECR REPO if not exist"){
			steps {
				script {
                    create_ecr_repo()
				}
			}
		}

	}	
}

