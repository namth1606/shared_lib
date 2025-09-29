def call(List<String> repositories) {
    pipeline {
        agent any
        stages {
            stage('Build') {
                steps {
                    echo "Building..."
                }
            }
            stage('Deploy') {
                steps {
                    echo "Deploying..."
                }
            }
            stage('Cleanup') {
                steps {
                    echo "Cleanup..."
                }
            }
        }
    }
}