node( ) {
    common = evaluate readfile("cicd\jenkins\jenkins-common\common.groovy")
    common.deploy("test")
}