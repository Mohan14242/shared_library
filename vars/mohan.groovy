pipeline{
    agent any 
    stages{
        stage('build'){
            steps{
                script{
                sh ' echo "this is the mohan"'
                }
            }
        }
    }
}