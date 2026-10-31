// Task 16.2: concrete Car class, inheriting from Vehicle

class Car(fuel: Int) : Vehicle(fuel) {
    override fun drive() {
        println("Vrooom!")
    }
}