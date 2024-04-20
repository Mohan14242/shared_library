def exam(){
      def str = "hello, world!"
      def upper = str.toUpperCase()
      def length=str.length()
      def sub=str.substring(1,6)
      def lower=str.lower()
      def repl=str.replace("hello","hi")
      def split=str.split(",")
      println("the upper case ${upper} and length is ${length} and sub string is ${sub}")
}