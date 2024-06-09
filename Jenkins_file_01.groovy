@Library("shared-lib-pipe") _
pipeline {
    agent { label "linux"}
    stages {
        stage('Preparations') {
            steps {
                if (var00 == "000") {
                     preparations000()
				} else if (var01 == "111") {
					preparations001()
				} else {
					preparations002()
				}				
            }    
        }        
        stage('Example') {
            steps {
                create_ecr_repo()
            }    
        }
	}	
}
