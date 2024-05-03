// my-shared-library/vars/mySharedFunction.groovy
def call(param1, param2) {
    // Your logic here
    println "Parameter 1: ${param1}"
    println "Parameter 2: ${param2}"
    // Example logic: Concatenate parameters
    def result = "${param1}-${param2}"
    return result
}
