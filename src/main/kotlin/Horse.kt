class Horse(food: String, location: String) : Animal(food, location) {
    override fun eat(): String {
        return "Лошадь ест еду"
    }

    override fun sleep(): String {
        return "Лошадь спит"
    }

    override fun makeNoise(): String {
        return "Лошадь фыркает"
    }
}