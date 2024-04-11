import kotlin.system.exitProcess

class ArchivesMenu (val archives: MutableMap<String, MutableMap<String, List<String>>>){


    private val notes: MutableMap<String, List<String>> =  mutableMapOf()


    private val menu: Menu
        get() = Menu("архив", archives.keys.toList())


    fun showArchivesMenu(): Pair<MutableMap<String, MutableMap<String, List<String>>>,String> {

        var result: Any = 1// Переменная для хранения результата выбора
        var names: String = ""
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
                in 2..archiveSize -> {
                    names = archives.keys.elementAt(input-2)


                }
                else -> {
                    println("Такого пункта нет. Попробуйте снова.")
                }
            }
        }
        return Pair(archives, names) // Нужно вернуть созданный архив и выбранный элемент
    }

    private fun createArchive() {
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