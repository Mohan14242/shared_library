pipeline{
    agent any 
    def names(Map maps){
        prod_deploy=maps.prod_deploy
        environment=maps.environment 
        choice=maps.choice 
        password=maps.password
    stages{
        stage("printing "){
            steps{
                script{
                    echo "the name is ${prod_deploy}"
                }
            }
        }

    }
}