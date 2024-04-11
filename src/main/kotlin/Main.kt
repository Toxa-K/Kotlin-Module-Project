fun main() {
    println("Добро пожаловать!")

    //Создание базы данны
    var notesArchives: MutableMap<String, MutableMap<String, List<String>>> =  mutableMapOf()


    //Запуск цикла программы
    while(true){
        //Запуск меню архива и прием выбранного архива
        val (updateArchives, title)  = ArchivesMenu(notesArchives).showArchivesMenu()//title -Первый ключ
        notesArchives = updateArchives


        //Запуск меню заметок и прием выбранной заметки
        var (updateNotes, sprite) = NotesMenu(notesArchives.get(title)).showNotesMenu()//sprite - Второй ключ
        notesArchives[title] = updateNotes!!







    }
}