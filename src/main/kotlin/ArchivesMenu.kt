class ArchivesMenu (var archives: MutableMap<String, MutableMap<String, MutableList<String>>>){
    private val notes: MutableMap<String, MutableList<String>> =  mutableMapOf()
    fun showArchivesMenu(): Triple<Any, String, Boolean> {
        val menu = Menu()
        return menu.choiceMenu(this, "archives")
    }
    fun createArchive() {
        // Логика для создания архива
        var flag = false
        while(!flag){
            print("Введите название архива: ")
            var input = readLine()
            if (!input.equals("")){
                archives[input.toString()] = notes
                flag = true
            }
            else{
                println("Поле не может быть пустым")
            }
        }
    }

}