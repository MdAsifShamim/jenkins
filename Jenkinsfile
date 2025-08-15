// Jenkinsfile (no extension)
pipeline {
    agent any
    stages {
        stage('Cleaning Stage') {
            steps {
                bat  'mvn clean '
            }
        }
   
        stage('Testing Stage') {
            steps {
                bat 'mvn test'
            }
        }
        
         stage('Code Quality') {
            steps {
                withSonarQubeEnv('SonarQube-Server') {
                    bat 'mvn sonar:sonar'
                }
            }
        }
              
        stage('Packaging Stage') {
            steps {
                bat  'mvn package'
            }
        }
        
        
    }
}