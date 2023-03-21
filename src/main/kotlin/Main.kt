fun main() {
    val hello = Words()
    val name = Message("Боря")
    var animal1 = Dog("Мясо","Стул")
    var animal2 = Cat("Рыба","Диван")
    var animal3 = Horse("Сено", "Пастбище")
    var veterinar = Vet()
    for (i in 1..3) {
        if (i == 1){
            println(animal1.eat())
            println(animal1.makeNoise())
            println(animal1.sleep())
            veterinar.treatAnimal(animal1)
        }
        if (i == 2){
            println(animal2.eat())
            println(animal2.makeNoise())
            println(animal2.sleep())
            veterinar.treatAnimal(animal2)
        }
        if (i == 3){
            println(animal3.eat())
            println(animal3.makeNoise())
            println(animal3.sleep())
            veterinar.treatAnimal(animal3)
        }
    }
}