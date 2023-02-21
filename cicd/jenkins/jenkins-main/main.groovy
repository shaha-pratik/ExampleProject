def checkoutGitDataManagement(branch) {    
    checkout([$class: 'GitSCM', branches: [[name: "*/$branch"]], extensions: [[$class: 'CloneOption', depth: 0]]])    
}

node( ) {
    echo "@@@@@@ Welcome again"
    echo "@@@@@@ I am new here"
    echo env.BRANCH_NAME
    echo "@@@@@@Before Checkout"
    checkoutGitDataManagement(env.BRANCH_NAME)
    echo "@@@@@@After Checkout"

}