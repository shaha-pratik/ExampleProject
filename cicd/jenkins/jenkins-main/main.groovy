node( ) {
    stage('checkout') { 
        checkout scm
    }
    def common = evaluate(readFile("cicd/jenkins/jenkins-common/common.groovy"))
    print(common)
    common.deploy("test")
}