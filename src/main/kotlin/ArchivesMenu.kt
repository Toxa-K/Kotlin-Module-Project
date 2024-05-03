class ArchivesMenu (var archives: MutableMap<String, MutableMap<String, MutableList<String>>>){
    private val notes: MutableMap<String, MutableList<String>> =  mutableMapOf()
    fun showArchivesMenu(): Triple<Any, String, Boolean> {
        val menu = Menu()
        return menu.choiceMenu(this, "archives")
    }
    fun createArchive() {
        // Логика для создания архива
        print("Введите название архива: ")
        val input = readLine()
        archives[input.toString()] = notes
    }

}