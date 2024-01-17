pipeline {
    agent any

    tools{
        gradle "Gradle-8"
    }
    stages{
        stage('Clone repo'){
            steps{
                git branch: 'main', url: 'https://github.com/HerbertMG/Test-Mobile-Exito.git'
            }
        }

        stage('Build'){
            steps{
                sh 'gradle build'
            }
        }

        stage('Tests'){
            steps{
                sh 'gradle test'
            }
        }
    } 
}