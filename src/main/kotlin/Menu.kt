class Menu(private val type: String, private val options: List<Any>) {

    fun showMenu() {
        println("\nМеню:")
        println("0. Создать $type")
        for ((index, option) in options.withIndex()) {
            println("${index + 1}. $option")
        }
        println("${options.size + 1}. Выход")

    }

    fun getUserChoice(): Int {
        print("Выберите пункт: ")
        val input = readLine()
        return try {
            input?.toInt() ?: 0
        } catch (e: NumberFormatException) {
            0
        }
    }
}