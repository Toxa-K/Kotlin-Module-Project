class NotesMenu(val notes: MutableMap<String, List<String>>?) {


    val text = mutableListOf<String>()
    private val menu: Menu
        get() = Menu("заметку", notes?.keys?.toList()!!)


    fun showNotesMenu(): Pair<MutableMap<String, List<String>>?, String> {
        var result: Any = 1// Переменная для хранения результата выбора
        var names: String = ""
        while (result !is String) {
            val notesSize = notes?.size
            menu.showMenu()

            result = when (val input = menu.getUserChoice()) {
                0 -> createNotes()
                in 1..notesSize!! -> {
                    names = notes?.keys?.elementAt(input-1) ?:
                    break
                }
                notesSize + 1 -> {
                    println("выход")
                    break
                }
                else -> {
                    println("Такого пункта нет. Попробуйте снова.")
                    // Продолжаем цикл, чтобы пользователь мог ввести корректное значение
                }
            }
        }
        return Pair(notes, names) // Возвращаем результат
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
        notes!![input.toString()] = text
    }



    private fun chooseArchive() {
        // Логика для выбора архива
        println("Тут"+notes?.size)
    }
}
