
pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                checkout scm
                sh 'javac String_calculator.java'
                sh 'java Testing_string_calculator'
            }
        }
    }
}
