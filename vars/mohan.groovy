// mohan.groovy
pipeline{
    agent any
    def names(Map maps) {
    def prod_deploy = maps.prod_deploy
    def environment = maps.environment
    def choice = maps.choice
    def password = maps.password
    
    stages{
        stage('build'){
            steps{
                script{
                echo "Enable debug mode: ${prod_deploy}"
                echo "Environment: ${environment}"
                echo "Browser: ${choice}"
                echo "Database Password: ${password}"
                }
            }
        }
    }
}
}
