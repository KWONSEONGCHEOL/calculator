pipeline {
    agent any
    stages {
        stage ('checkout') {
            steps {
                git url :'https://github.com/KWONSEONGCHEOL/calculator.git'
            }
        }
      stage('Compile'){
            steps {
                sh './gradlew compileJava'
            }
        }
        stage ('Unit test') {
            steps {
                sh './gradlew test'
            }
        }
        stage ("code coverage") {
            steps {
                sh "./gradlew jacocoTestReport"
                sh "./gradlew jacocoTestCoverageVerification"
                
            }
        }
        stage ("Static code analysis") {
            steps {
                sh "./gradlew checkstyleMain"
                publishHTML (target: [
                    reportDir: 'build/reports/checkstyle/',
                    reportFiles: 'main.html',
                    reportName: "checkstyle Report"])
            }
        }
    }
    post {
        always {
            mail to : "zx7613@naver.com",
            subject : "Completed Pipeline : ${currentBuild.fullDisplayName}",
            body: "Your build completed, please check: ${env.BUILD_URL}"
        }
    }
            
        
    
}
