node( ) {
    stage('checkout') { 
        checkout scm
    }
    def common = evaluate readFile("cicd/jenkins/jenkins-common/common.groovy")
    print(common)
    def common1 = readFile("cicd/jenkins/jenkins-common/common.groovy")
    print(common1)
    common.deploy("test")
}