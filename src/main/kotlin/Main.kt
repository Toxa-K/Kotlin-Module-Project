fun main() {
    println("Добро пожаловать!")
    //Создание базы данных
    var notesArchives: MutableMap<String, MutableMap<String, MutableList<String>>> =  mutableMapOf()
    var flag: Boolean = true

    //Запуск цикла программы
    while(flag == true) {

        //Запуск меню архива и прием выбранного архива
        var (updateArchives, fkey, flag) = ArchivesMenu(notesArchives).showArchivesMenu()//fkey -Первый ключ
        /*val (updateArchives, fkey, flag) = ArchivesMenu(notesArchives as MutableMap<String, MutableMap<String, MutableList<String>>>).showArchivesMenu()*/

        notesArchives = updateArchives as MutableMap<String, MutableMap<String, MutableList<String>>>//Обновляем архивы
        if (!flag) break

        var second = notesArchives[fkey]//Выбранный архив


        while(flag == true){
            //Запуск меню заметок и прием выбранной заметки
            var (updateNotes, skey, flag) = NotesArchivesMenu(second as MutableMap<String, MutableList<String>>).showNotesArchivesMenu()//skey - Второй ключ
            notesArchives[fkey] = updateNotes as MutableMap<String, MutableList<String>>//обновляем закладки выбранного архива

            if (!flag) break

            if(flag){//Запуск меню заметки
                var newNotes = Notes(notesArchives[fkey]?.get(skey) as MutableList<String>).showNotesMenu()//Меню редактора заметки
                notesArchives[fkey]?.set(skey, newNotes as MutableList<String>)//внесение измененной\созданной заметки
            }


        }


    }
    println("До свидания!")
}
