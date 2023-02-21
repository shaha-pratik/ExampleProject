def checkoutGitDataManagement(branch) {    
    checkout([$class: 'GitSCM', branches: [[name: "*/$branch"]]])    
}

node( ) {    
    checkoutGitDataManagement(env.BRANCH_NAME)    
    def common = evaluate readFile('cicd/jenkins/jenkins-common/Common.groovy')    
    
    common.deploy("test")
}