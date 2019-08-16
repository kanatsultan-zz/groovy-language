#! groovy


pipeline {
    agent any
    environment {
        BUILD_VERSION = nextVersionFromGit()
        // def MY_GIT_TAG = sh(returnStdout: true, script: 'git describe --abbrev=0 --tags').trim().tokenize('.'[0])
    }
    stages {
        stage('Install'){
            steps {
                echo "Installing ..."
                // echo "$BUILD_VERSION"
                echo "This is a latest GIT TAG: $MY_GIT_TAG"
            }
        }
        stage('Test'){
            steps {
                echo "Testing ..."
            }
        }
        stage('Deploying'){
            steps {
                echo "Deploying ..."
            }
        }
        stage('CleanWorkSpace'){
            steps {
                sh 'rm -rf ${WORKSPACE}/*'
            }
        }
    }
}

// Pull existing latest tags and increments by 1 tags for latest commint and pushes to git.
// Uses same tag for build release

def nextVersionFromGit(){
    def latestVersion = sh returnStdout: true, script: 'git log -l'
    def intValue = latestVersion.tokenize().toSorted()
    return intValue
}