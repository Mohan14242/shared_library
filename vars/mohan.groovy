pipeline{
    agent any 
    def name="mohan"
    stages{
        stage("printing "){
            steps{
                script{
                    echo "the name is ${name}"
                }
            }
        }

    }
}