class NotesMenu {

    private val menu = Menu(listOf("заметку", "Тут должны быть заметки"))

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
    }

    private fun displayNoteScreen() {
        // Логика для отображения экрана заметки
    }
}