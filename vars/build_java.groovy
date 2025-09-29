def call(List<String> repositories) {
    pipeline {
        agent any
        stages {
            stage('Build') {
                steps {
                    echo "Building: ${repositories}"
                }
            }
            stage('Deploy') {
                steps {
                    echo "Deploying..."
                }
            }
        }
    }
}