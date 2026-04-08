// pipeline {
//     agent any

//     stages {
//         stage('Checkout Code') {
//             steps {
//                 git 'https://github.com/Archish1962/demo1.git'
//             }
//         }

//         stage('Run Test') {
//             steps {
//                 sh 'mvn test'   // Use 'sh' if Linux, 'bat' if Windows
//             }
//         }
//     }

//     post {
//         always {
//             junit 'target/surefire-reports/*.xml'
//         }
//     }
// }

pipeline {
    agent any

    tools {
        jdk 'JDK17'
        maven 'Maven3'
    }

    stages {
        stage('Build') {
            steps {
                bat 'mvn clean compile'   // use 'sh' for Linux
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }
    }

    post {
        always {
            junit '**/target/surefire-reports/*.xml'
        }
    }
}