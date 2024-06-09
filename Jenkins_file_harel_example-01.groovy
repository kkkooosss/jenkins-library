import groovy.json.JsonOutput
def call() {
	def var-00 = "000"
	def var-01 = "111"
	def var-02 = "222"
	def var-03 = "333"
	def var-04 = "444"
	def var-05 = "555"
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
					if (${env.var-00}="000")
					   preparations000.groovy()
					else if(${env.var-01}="111")
					   preparations001.groovy
					else if(${env.var-02}="222")
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

