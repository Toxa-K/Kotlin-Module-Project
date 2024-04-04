/*
class NotesMenu {

    private val notes: MutableList<String> = mutableListOf("Заметки")
    private val menu: Menu
        get() = Menu(notes)

    fun showNotesMenu() {
        menu.showMenu()
        when (menu.getUserChoice()) {
            1 -> chooseNote()
            2 -> createNote()
            3 -> displayNoteScreen()
            else -> {
                println("Такого пункта нет. Попробуйте снова.")
                showNotesMenu()
            }
        }
    }

    private fun chooseNote() {
        // Логика для выбора заметки
    }

    private fun createNote() {
        // Логика для создания заметки
        print("Выберите пункт: ")
        val input = readLine()
        try {
            input?.toString() ?: 0
        } catch (e: NumberFormatException) {
            0
        }
        notes.add(input.toString())
        showNotesMenu()
    }

    private fun displayNoteScreen() {
        // Логика для отображения экрана заметки
    }
}*/
