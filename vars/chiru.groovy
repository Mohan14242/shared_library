def call(){
    pipeline{
        stages{
            stage('bulding '){
                steps{
                    script{
                        echo "this is the pipeline"
                    }
                }
            }
        }
    }
}