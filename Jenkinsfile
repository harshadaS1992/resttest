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
       stage ('Cucumber Reports') {

            steps {
                cucumber buildStatus: "UNSTABLE",
                    fileIncludePattern: "**/cucumber.json",
                    jsonReportDirectory: 'target'
            }
       }
   }
   
}
