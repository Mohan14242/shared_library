def names(Map configmap) {
    def application = configmap.application
    def component = configmap.component
    echo "This is my application: ${application} and component: ${component}"
}