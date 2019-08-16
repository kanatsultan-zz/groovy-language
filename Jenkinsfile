#! groovy


pipeline {
    agent any
    environment {
        BUILD_VERSION = nextVersionFromGit()
        DELETED_TAGS = deleteAllTags()
        // def MY_GIT_TAG = sh(returnStdout: true, script: 'git describe --abbrev=0 --tags').trim().tokenize('.'[0])
    }
    stages {
        stage('Install'){
            steps {
                echo "Installing ..."
                sh 'git fetch --tags --force'
                echo "$BUILD_VERSION"
            }
        }
        stage('Test'){
            steps {
                echo "Testing ..."
                echo "$DELETED_TAGS"
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
    def latestVersion = sh returnStdout: true, script: 'git tag -l'
    def intValue = latestVersion.tokenize().toSorted()
    return intValue
}

def deleteAllTags(){
    def deleteLocalTags = sh returnStdout: true, script: 'git tag | xargs git tag -d'
    return deleteLocalTags
}