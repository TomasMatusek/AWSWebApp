# Jenkins build:
1. Phase: 
- Build FE using docker
- Builded FE is place into folder in filesystem
2. Phase:
- Run FE using generate files by copying them into container
  

# Running Jenkins:
  pipeline {
    agent any
    stages {
        stage('GiT checkout') {
            steps {
                echo 'GiT CHECKOUT ...'
                checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/TomasMatusek/AWSWebApp']]])
                echo 'Folders structure ....'
                sh 'ls -al'
                dir('Client') {
                    nodejs('NodeJS 14.15.4') {
                        sh 'npm --version'
                        sh 'npm install'
                    }   
                }
            }
        }
        stage('Build') {
            steps {
                echo 'BUILD ...'
                dir('Client') {
                    echo pwd()
                    sh 'ls -al'
                    nodejs('NodeJS 14.15.4') {
                        sh 'npm install @angular/cli'
                        sh 'ng build'
                    }
                }
            }
        }
        stage('PostBuild') {
            steps {
                echo 'POST BUILD ...'
                sh 'ls -al'
            }
        }
    }
}