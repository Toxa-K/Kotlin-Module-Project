class ArchivesMenu {


    private val notesArchives: MutableMap<String, MutableMap<String, List<String>>> = HashMap()

    private val notes: MutableMap<String, List<String>> = HashMap()
    private val menu: Menu
        get() = Menu("архив", notesArchives.keys.toList())


    fun showArchivesMenu() {

        menu.showMenu()
        when (menu.getUserChoice()) {
            0 -> createArchive()
            1 -> chooseArchive()
            2 -> System.exit(0)
            else -> {
                println("Такого пункта нет. Попробуйте снова.")
                showArchivesMenu()
            }
        }
    }

    private fun createArchive() {
        // Логика для создания архива
        print("Введите название архива: ")
        val input = readLine()
        try {
            input?.let { it.toString() } ?: throw NumberFormatException()
        } catch (e: NumberFormatException) {
            println(e)
            return
        }
        notesArchives[input.toString()] = HashMap()
        showArchivesMenu()
    }



    private fun chooseArchive() {
        // Логика для выбора архива
    }

}