fun main() {
    println("Добро пожаловать!")


    val notesArchives: MutableMap<String, MutableMap<String, List<String>>> =  mutableMapOf()
    while(true){
        val arch = ArchivesMenu(notesArchives).showArchivesMenu().toString()
        notesArchives.put(arch)
        val note = NotesMenu(notesArchives[arch]).showNotesMenu().toString()
        if (note == "1")
            break



    }


    /*val archivesMenu = ArchivesMenu(notesArchives)
      archivesMenu.showArchivesMenu()*/
}