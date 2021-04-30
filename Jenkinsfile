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
                dir('RestTesting') {
                   sh "pwd"
                   sh "mvn integration-test"
                  }
              
            }
        }
        stage('Generate HTML report') {
        cucumber buildStatus: 'SUCCESS',
                reportTitle: 'My report',
                fileIncludePattern: '**/*.json',
                trendsLimit: 10,
                classifications: [
                    [
                        'key': 'Browser',
                        'value': 'Firefox'
                    ]
                ]
    }
}
    }
   
}
