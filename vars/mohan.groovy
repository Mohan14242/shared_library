#!groovy
def names(Map configmap){
    application=configmap.get("application")
    componenet=configmap.get("componenet")
    echo "this is my applications ${application} and ${componenet}"

}