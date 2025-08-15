// Jenkinsfile (no extension)
pipeline {
    agent any
    stages {
        stage('Cleaning Stage') {
            steps {
                bat  'mvn clean '
            }
        }
    stages {
        stage('Testing Stage') {
            steps {
                bat 'mvn test'
            }
        }
    stages {
        stage('Packaging Stage') {
            steps {
                bat  'mvn package'
            }
        }
    }
}