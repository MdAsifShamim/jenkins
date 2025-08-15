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
              
        stage('Packaging Stage') {
            steps {
                bat  'mvn package'
            }
        }
        
     	stage('consolidate Results'){
     		steps{
     			input("Do you want to capture results?")
     			junit '**/target/surefire-reports/TEST-*.xml'
     			archive 'target/*.jar' 
     		}
     	} 
     	
     	stage('Email build status'){
     		steps{
     			mail body:"${env.JOB_NAME} - Build #${env.BUILD_NUMBER} -${currentBuild.currentResult} \n\n Check console output at ${env.BUILD_URL} to view result.",subject: "${env.BUILD_NUMBER}-${currentBuild.currentResult}!!",to:'asifshamim0403@gmail.com',from:'asifshamim0403@gmail.com'
     		}
     	}  
    }
}