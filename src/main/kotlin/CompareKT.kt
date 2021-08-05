class CompareKT {
    fun nullSafe(str: String?): Int? {
        return str?.length
    }

    fun strConcat(str: String) {
        println("This is a str $str")
    }

    @Test
    fun `test 1 with 2 with 3 with 4`() {
    }
}

data class Person(val name: String)