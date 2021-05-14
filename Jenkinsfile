pipeline {
    agent any
    tools {
        maven 'maven'
    }
    stages {
        stage('Maven Version') {
            steps {
                bat 'mvn --version'
            }
        }
        stage('Java Version') {
                    steps {
                        bat 'javac -version'
                        bat 'java -version'
                    }
                }
        stage('Maven Build') {
                     steps {
                            
							bat 'mvn clean package'
                            }
                               }
    }
    triggers {
      bitbucketPush()
    }
}