class Message(name: String) {
    init {
        println(introduce(name))
    }
    fun introduce(name: String): String {
        return "Привет, меня зовут ${name}."
    }
}