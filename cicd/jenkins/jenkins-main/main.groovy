def checkoutGitDataManagement(branch) {    
    checkout([$class: 'GitSCM', branches: [[name: "*/$branch"]]])    
}

node( ) {    
    checkoutGitDataManagement(env.BRANCH_NAME)
}