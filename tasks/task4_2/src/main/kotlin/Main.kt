// Task 4.2: use of if and ranges

fun main() {
    // Add your code here
    print("PIZZA MENU\n\n(a) Margherita\n(b) Pepperoni\n(c) Mighty Meaty\n(d) Boscaiola\n\nChoose your pizza (a-d): ")
    val za = readln().lowercase()

    val message = if (za.length != 1) {
        "Invalid choice!"
    }
    else if (za.single() in 'a'..'d' == false) {
        "Invalid choice!"
    }
    else {
        "Order accepted"
    }

    println(message)
}
