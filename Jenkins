pipeline{
    agent {
        node {
            label 'python'
        }
    }
    environment{
        user_data="mohan"
    }

    stages{
        stage("testung "){
            steps{
                sh '''
                echo "this is the variable $user_data '''
            }
        }
    }
}