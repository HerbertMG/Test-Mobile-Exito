pipeline {
    agent any

    tools{
        gradle "Gradle-8"
    }
    stages{
        stage('Clone repo'){ // Clonamos el repositorio
            steps{
                git branch: 'main', url: 'https://github.com/HerbertMG/Test-Mobile-Exito.git'
            }
        }

        stage('Build'){ // Descargamos las dependencias
            steps{
                sh 'gradle build'
            }
        }

        stage('Tests'){ // Ejecutamos el runner del proyecto
            steps{
                sh 'gradle test'
            }
        }
    } 
}