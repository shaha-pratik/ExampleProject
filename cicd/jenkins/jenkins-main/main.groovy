node( ) {
    common = evaluate readFile("cicd/jenkins/jenkins-common/common.groovy")
    common.deploy("test")
}