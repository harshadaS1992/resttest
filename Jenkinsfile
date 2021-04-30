pipeline {
    agent any
    stages {
        stage('clone') {
            steps {
                checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[credentialsId: 'GITHUB', URL: 'https://github.com/harshadaS1992/resttest.git']]])
            }
        }
         stage('run') {
            steps {
                echo 'Hello World'
            }
        }
    }
}
