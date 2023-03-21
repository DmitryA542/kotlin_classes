class Dog(food: String, location: String) : Animal(food, location) {
    override fun eat(): String {
        return "Собака ест еду"
    }

    override fun sleep(): String {
        return "Собака спит"
    }

    override fun makeNoise(): String {
        return "Собака лает"
    }
}