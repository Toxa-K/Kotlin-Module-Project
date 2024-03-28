class Menu(private val options: List<String>) {

    fun showMenu() {

        for ((index, option) in options.withIndex()) {
            if (index == 0) println("${index}. Создать $option")
            else println("${index}. $option")
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