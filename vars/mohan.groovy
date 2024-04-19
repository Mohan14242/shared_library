#!groovy 
pipeline{
    agent any 
    stages{
        stage("build "){
            steps{
                script{
                    echo " this is the mohane"
                }
            }
        }
    }
}