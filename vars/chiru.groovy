def names() {
    def values = "this is the mohan who are you"
    def keys = "these are the keys from the mohan"

    pipeline {
        agent any
        stages {
            stage("build") {
                steps {
                    script {
                        echo "These are the keys and values: ${values} and ${keys}"
                    }
                }
            }
        }
    }
}
