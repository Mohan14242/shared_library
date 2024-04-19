#!groovy 
pipeline{
    agent any 
    stages{
        stage("build "){
            steps{
                script{
                    echo " this is the mohane"
                    echo "who are you this is the only one of the entire world"
                }
            }
        }
    }
}