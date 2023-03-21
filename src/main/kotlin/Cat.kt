class Cat(food: String, location: String) : Animal(food, location) {
    override fun eat(): String {
        return "Кот ест еду"
    }

    override fun sleep(): String {
        return "Кот спит"
    }

    override fun makeNoise(): String {
        return "Кот мяукает"
    }
}
