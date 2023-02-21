node( ) {
    stage('checkout') { 
        checkout scm
    }
    def common = readFile("cicd/jenkins/jenkins-common/common.groovy")
    common.deploy("test")
}