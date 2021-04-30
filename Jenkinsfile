pipeline {
    agent any
    stages {
        stage('clone') {
            steps {
                git credentialsId: 'GITHUB', url: 'https://github.com/harshadaS1992/resttest.git'
            }
        }
         stage('run') {
            steps {
                cd RestTesting
                sh "ls -l"
                sh "mvn clean install"
                echo 'Hello World'
            }
        }
    }
}
