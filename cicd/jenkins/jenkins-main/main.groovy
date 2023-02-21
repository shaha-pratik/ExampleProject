def checkoutGitDataManagement(branch) {    
    checkout([$class: 'GitSCM', branches: [[name: "*/$branch"]], extensions: [[$class: 'CloneOption', depth: 0]]])    
}
def origin() {
    echo "@@@@@@ I am new here"
    echo env.BRANCH_NAME
    echo "@@@@@@Before Checkout"
    checkoutGitDataManagement(env.BRANCH_NAME)
    echo "@@@@@@After Checkout"
}
node( ) {
    stage ('Checkout') {
        checkout scm
    }
    stage ('First test') {
        sh 'mvn help:evaluate -Dexpression=project.version -q -DforceStdout'
    }

}