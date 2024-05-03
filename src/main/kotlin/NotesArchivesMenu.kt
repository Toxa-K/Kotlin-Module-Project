class NotesArchivesMenu(var notes: MutableMap<String, MutableList<String>>) {
    private val text = mutableListOf<String>()
    private val menu: Menu
        get() = Menu(/*"заметку", notes.keys.toList()*/)

    fun showNotesArchivesMenu(): Triple<Any, String, Boolean> {
        return menu.choiceMenu(this,"notes")
    }
    /*fun showNotesArchivesMenu(): Pair<MutableMap<String, MutableList<String>>, String> {
        if (notes.isEmpty())
            notes = mutableMapOf()
        var names = ""

        while (true) {
            val notesSize = notes.size
            menu.showMenu()

            when (val input = menu.getUserChoice()) {
                0 -> createNotesArchives()
                1 -> {
                    println("выход")
                    break
                }
                in 2..notesSize+2 -> {
                    names = notes.keys.elementAt(input-2)
                    break
                }
                else -> {
                    println("Такого пункта нет. Попробуйте снова.")
                }
            }
        }
        return Pair(notes, names) // Возвращаем результат
    }*/

    fun createNotesArchives() {
        // Логика для создания архива
        print("Введите название заметки: ")
        val input = readLine()
        try {
            input?.let { it.toString() } ?: throw NumberFormatException()
        } catch (e: NumberFormatException) {
            println(e)
            return
        }
        notes[input.toString()] = text
    }

    /*private fun chooseArchive() {
        // Логика для выбора архива
        println("Тут"+notes.size)
    }*/
}
