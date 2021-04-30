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
                   sh "mvn install"
                  }
              
            }
        }
    }
    post {
  	     failure {

  	      echo "Test failed"
                      cucumber buildStatus: 'FAIL',
                                   failedFeaturesNumber: 1,
                                   failedScenariosNumber: 1,
                                   skippedStepsNumber: 1,
                                   failedStepsNumber: 1,
                                   fileIncludePattern: '**/*.json',
                                   sortingMethod: 'ALPHABETICAL'

          slackSend color: 'red', message: "${params.reportname} Tests failed. >> Click to view <$reportUrl|report>"

  	     }

  	      success {

          echo "Test succeeded"
                     cucumber buildStatus: 'SUCCESS',
                                            failedFeaturesNumber: 0,
                                            failedScenariosNumber: 0,
                                            skippedStepsNumber: 0,
                                            failedStepsNumber: 0,
                                            fileIncludePattern: '**/*.json',
                                            sortingMethod: 'ALPHABETICAL'

          slackSend color: 'green', message: "${params.reportname} Tests passed. >> Click to view <$reportUrl|report>"

          }

  }
}
