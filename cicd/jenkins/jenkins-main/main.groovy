# node( ) {
#     def common = evaluate(readFile("cicd/jenkins/jenkins-common/common.groovy"))
#     print(common)
#     common.deploy("test")
# }


def checkoutGitDataManagement(branch) {    
    checkout([$class: 'GitSCM', branches: [[name: "*/$branch"]], doGenerateSubmoduleConfigurations: false, extensions: [[$class: 'GitLFSPull'], [$class: 'CloneOption', depth: 0]], submoduleCfg: []])    
}

node( ) {    
    checkoutGitDataManagement(env.BRANCH_NAME)    
    def common = evaluate readFile('cicd/jenkins/jenkins-common/Common.groovy')    
    
    common.deploy("test")
}