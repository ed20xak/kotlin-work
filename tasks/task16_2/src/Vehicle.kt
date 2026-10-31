// Task 16.2: abstract Vehicle class

abstract class Vehicle(var fuelLevel: Int) {
    fun refuel(amount: Int) {
        require(amount >= 0) { "Invalid fuel amount" }
        fuelLevel += amount
    }

    abstract fun drive()
}