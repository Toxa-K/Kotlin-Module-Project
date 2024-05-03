class ArchivesMenu (var archives: MutableMap<String, MutableMap<String, MutableList<String>>>){
    private val notes: MutableMap<String, MutableList<String>> =  mutableMapOf()

    fun showArchivesMenu(): Triple<Any, String, Boolean> {
        val menu = Menu()
        return menu.choiceMenu(this, "archives")
    }

    /*fun showArchivesMenu(): Pair<MutableMap<String, MutableMap<String, MutableList<String>>>,String> {

        var result: Any = 1// Переменная для хранения результата выбора
        var names = ""
        while (result !is String) {
            val archiveSize = archives.size
            menu.showMenu()

            result = when (val input = menu.getUserChoice()) {
                //Создание нового архива
                0 -> createArchive()
                //Выход из программы
                1 -> {
                    println("выход")
                    exitProcess(0)
                }
                //Выбор из предложенных архивов
                in 2..archiveSize+2 -> {
                    names = archives.keys.elementAt(input-2)
                    break
                }
                else -> {
                    println("Такого пункта нет. Попробуйте снова.")
                }
            }
        }
        println("Return" + archives + " и " + names)
        return Pair(archives, names) // Нужно вернуть созданный архив и выбранный элемент
    }*/

    fun createArchive() {
        // Логика для создания архива
        print("Введите название архива: ")
        val input = readLine()
        archives[input.toString()] = notes
    }

    /*private fun chooseArchive(input:Int): String {
        // Логика для выбора архива
        println(" Тут " + archives.size+ " какой выбрали " + input + " Его название " + archives.keys.elementAt(input-1))
        return archives.keys.elementAt(input-1)
    }*/
}