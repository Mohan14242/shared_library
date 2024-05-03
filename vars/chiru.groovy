def details(Map person){
    def name=person["name"]
    def age=person["age"]
    echo "the name is ${name}"
    echo "the details are ${age}"
}