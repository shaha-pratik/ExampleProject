def checkoutGitDataManagement(branch) {    
    checkout([$class: 'GitSCM', branches: [[name: "*/$branch"]]])    
}

node( ) {
    echo "@@@@@@Before Checkout"
    checkoutGitDataManagement(env.BRANCH_NAME)
    echo "@@@@@@After Checkout"

}