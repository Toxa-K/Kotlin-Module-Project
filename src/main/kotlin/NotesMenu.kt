import kotlin.system.exitProcess

class NotesMenu(private val notes: MutableMap<String, List<String>>) {



    private val menu: Menu
        get() = Menu("заметку", notes.keys.toList())


    fun showNotesMenu(): Any? {
            var result: Any = 1// Переменная для хранения результата выбора
        while (result !is String) {
            val archiveSize = notes.size
            menu.showMenu()

            result = when (val input = menu.getUserChoice()) {
                0 -> createNotes()
                in 1..archiveSize -> {
                    result = notes.keys.elementAt(input-1)
                    break
                }
                archiveSize + 1 -> {
                    println("выход")
                    break
                }
                else -> {
                    println("Такого пункта нет. Попробуйте снова.")
                    // Продолжаем цикл, чтобы пользователь мог ввести корректное значение
                }
            }
        }
        return result // Возвращаем результат
    }



    private fun createNotes() {
        // Логика для создания архива
        print("Введите название архива: ")
        val input = readLine()
        try {
            input?.let { it.toString() } ?: throw NumberFormatException()
        } catch (e: NumberFormatException) {
            println(e)
            return
        }
        notes[input.toString()]
    }



    private fun chooseArchive() {
        // Логика для выбора архива
        println("Тут"+notes.size)
    }
}
