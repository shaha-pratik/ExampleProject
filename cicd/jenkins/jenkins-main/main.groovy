node( ) {
    stage('checkout') { 
        checkout scm
    }
    def common = evaluate readFile("cicd/jenkins/jenkins-common/common.groovy")
    common.deploy("test")
}