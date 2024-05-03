fun main() {
    println("Добро пожаловать!")
    //Создание базы данных
    var notesArchives: MutableMap<String, MutableMap<String, MutableList<String>>> =  mutableMapOf()
    var flag = true

    //Запуск цикла программы
    while(flag) {
        //Запуск меню архива и прием выбранного архива
        val (updateArchives, fkey, fi) = ArchivesMenu(notesArchives).showArchivesMenu()
        print(fkey)

        //Обновляем архивы
        notesArchives = updateArchives as MutableMap<String, MutableMap<String, MutableList<String>>>

        flag = fi

        if (!flag) break

        //Выбранный архив
        val second = notesArchives[fkey]

        println(notesArchives)
        while(flag){
            //Запуск меню заметок и прием выбранной заметки
            val (updateNotes, skey, fi) = NotesArchivesMenu(second as MutableMap<String, MutableList<String>>).showNotesArchivesMenu()
            //обновляем закладки выбранного архива
            notesArchives[fkey] = updateNotes as MutableMap<String, MutableList<String>>

            println(notesArchives)

            flag = fi

            print(skey)

            if(flag){//Запуск меню заметки
                println("tyt2")
                val newNotes = Notes(notesArchives[fkey]?.get(skey) as MutableList<String>).showNotesMenu()//Меню редактора заметки
                notesArchives[fkey]?.put(skey, newNotes as MutableList<String>)//внесение измененной\созданной заметки
            }
        }
        flag = true
    }
    println("До свидания!")
}




