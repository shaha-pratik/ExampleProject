node( ) {
    stage('checkout') { 
        checkout scm
    }
    def common = evaluate(new File("C:/ProgramData/Jenkins/.jenkins/workspace/ExampleProject/cicd/jenkins/jenkins-common/common.groovy"))
    common.deploy("test")
}