open class Animal(
    var food: String,
    var location: String,
    ) {

    open fun makeNoise(): String {
        return "Рёв"
    }
    open fun eat(): String {
        return "Животное ест еду"
    }
    open fun sleep(): String {
        return "Животное спит"
    }
}