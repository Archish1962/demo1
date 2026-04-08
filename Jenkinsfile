pipeline{
    agent any
    stages{
        stage('Checkout code'){
            steps{
                git 'https://github.com/Archish1962/demo1.git'
            }

            steps('Run test'){
                sh 'mvn test'
            }
        }

        }
    post{
        always{
            junit 'target/surefire-reports/*.xml'
        }
    }
}