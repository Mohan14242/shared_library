#!groovy
pipeline{
    agent any 
    environment{
        def names(Map configmap){
            application=configmap.get('application')
            component=configmap.get('componenet')
        }

    }
    stages{
        stage("build"){
            steps{
                script{
                echo "the applications is${application}"
                echo "the compoent is ${component}"
            }
            }
        }
    }
}
