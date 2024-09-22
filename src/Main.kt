fun main() {
    val array: List<String> = arrayListOf("one","two","three","four","five")
    val newArray: List<String> = array.map { it.reversed() }
    println(newArray)

}