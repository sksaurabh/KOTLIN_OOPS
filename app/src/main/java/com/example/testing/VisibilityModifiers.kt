// class A is accessible from same source file
private class A {
    private val int = 10
    fun display()
    {
        println(int) // we can access int in the same class
        println("Accessing int successful")
    }
}
fun main(args: Array<String>){
    var a = A()
    a.display()
    //println(a.int) // can not access 'int': it is private in class A
}
