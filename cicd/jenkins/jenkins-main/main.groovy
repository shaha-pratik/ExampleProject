node( ) {
    stage('checkout') { 
        checkout scm
    }
    def common = evaluate(new File("cicd/jenkins/jenkins-common/common.groovy"))
    common.deploy("test")
}