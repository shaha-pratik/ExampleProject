node( ) {
    stage('checkout') { 
        checkout scm
    }
    def common = evaluate(new File("C:/ProgramData/Jenkins/.jenkins/workspace/ExampleProjectcicd/jenkins/jenkins-common/common.groovy"))
    common.deploy("test")
}