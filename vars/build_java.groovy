def call(Map input) {
    pipeline {
        agent any
        parameters {
            string(name: 'repositories', defaultValue: 'repo1,repo2', description: 'Comma-separated list of repositories to build')
        }
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