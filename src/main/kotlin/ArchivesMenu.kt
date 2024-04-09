import kotlin.system.exitProcess

class ArchivesMenu (private val archives: MutableMap<String, MutableMap<String, List<String>>>){


    private val notes: MutableMap<String, List<String>> =  mutableMapOf()


    private val menu: Menu
        get() = Menu("архив", archives.keys.toList())


    fun showArchivesMenu(): Any {

        var result: Any = 1// Переменная для хранения результата выбора
        while (result !is String) {
            val archiveSize = archives.size
            menu.showMenu()

            result = when (val input = menu.getUserChoice()) {
                0 -> createArchive()
                in 1..archiveSize -> {
                    chooseArchive(input-1)
                    break
                }
                archiveSize + 1 -> {
                    println("выход")
                    exitProcess(0)
                }
                else -> {
                    println("Такого пункта нет. Попробуйте снова.")
                     // Продолжаем цикл, чтобы пользователь мог ввести корректное значение
                }
            }
        }
        return (archives) // Возвращаем результат
    }

    private fun createArchive() {
        // Логика для создания архива
        print("Введите название архива: ")
        val input = readLine()
        archives[input.toString()] = notes
    }

    private fun chooseArchive(input:Int): String {
        // Логика для выбора архива
        println(" Тут " + archives.size+ " какой выбрали " + input + " Его название " + archives.keys.elementAt(input-1))
        return archives.keys.elementAt(input-1)
    }
}