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
        bat 'dir'
        withEnv(['PATH+MVN=D:/Software/apache-maven-3.9.0-bin/apache-maven-3.9.0/bin']) {
             bat 'mvn org.apache.maven.plugins:maven-help-plugin:2.1.1:evaluate -Dexpression=project.version'
             def status = bat(script: 'mvn help:evaluate -Dexpression=project.version -q -DforceStdout', returnStdout: true)
        }
        echo "@@@@@@@@@After something life is great"
        echo $status
    }

}