def names(){
    def values="this is the mohan  who are you "
    def keys="this are the keys from the mohan"
    pipeline{
        stages{
            stage("build"){
                steps{
                    echo "this are the keys and values ${values} and ${keys}"
                }
            }
        }
    }

}