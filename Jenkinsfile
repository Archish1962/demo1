pipeline {
    agent any

    stages {
        stage('Checkout Code') {
            steps {
                git branch: 'main', url: 'https://github.com/Archish1962/demo1.git'
            }
        }

        stage('Run Test') {
            steps {
                bat 'mvn test'   // Use 'sh' if Linux, 'bat' if Windows
            }
        }
    }

    post {
        always {
            junit 'target/surefire-reports/*.xml'
        }
    }
}
