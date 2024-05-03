class NotesArchivesMenu(var notes: MutableMap<String, MutableList<String>>) {
    private val text = mutableListOf<String>()

    fun showNotesArchivesMenu(): Triple<Any, String, Boolean> {
        val menu = Menu()
        return menu.choiceMenu(this,"notes")
    }

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

}
