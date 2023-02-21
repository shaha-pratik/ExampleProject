def deploy(artifactVersion) {
    stage("Test") {
        echo artifactVersion
    }
}