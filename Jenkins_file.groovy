@Library("shared-lib-pipe") _

pipeline {
    agent {
        label 'linux'
    }
    parameters {
        string(name: 'VAR_00', defaultValue: '000', description: 'Variable 00')
    }
    environment {
        var_00 = "${params.VAR_00 ?: '000'}"
        var_01 = ""
        var_02 = ""
        var_03 = ""
    }
    stages {
        stage("Preparations") {
            steps {
                script {
                    preparations000()
                    // Explicitly set the environment variables
                    env.var_01 = "${env.var_01}"
                    env.var_02 = "${env.var_02}"
                    env.var_03 = "${env.var_03}"
                    sh """
                        echo this is Preparation stage.
                        echo var_00: ${env.var_00}
                        echo var_01: ${env.var_01}
                        echo var_02: ${env.var_02}
                        echo var_03: ${env.var_03}
                    """
                }
            }
        }
        stage("Create ECR REPO if not exist") {
            steps {
                script {
                    echo "Creating ECR REPO with var_00: ${env.var_00}, var_01: ${env.var_01}, var_02: ${env.var_02}, var_03: ${env.var_03}"
                    create_ecr_repo(env.var_01, env.var_02, env.var_03)
                }
            }
        }
    }
}
