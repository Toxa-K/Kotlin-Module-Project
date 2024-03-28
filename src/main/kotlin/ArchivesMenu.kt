class ArchivesMenu {

    private val menu = Menu(listOf("архив", "Тут должны быть архивы"))

    fun showArchivesMenu() {
        menu.showMenu()
        when (menu.getUserChoice()) {
            1 -> createArchive()
            2 -> chooseArchive()
            3 -> System.exit(0)
            else -> {
                println("Такого пункта нет. Попробуйте снова.")
                showArchivesMenu()
            }
        }
    }

    private fun chooseArchive() {
        // Логика для выбора архива
    }

    private fun createArchive() {
        // Логика для создания архива
    }
}