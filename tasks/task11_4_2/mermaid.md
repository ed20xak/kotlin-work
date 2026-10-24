# UML Class Diagram

Here is a UML class diagram, specified using [Mermaid][mer].

```mermaid
classDiagram
    class Customer {
        Name
        Address
        placeOrder()
    }

    class Order {
        orderNumber
        datePlaced
        deliveryDate
        checkStock()
        takePayment()
    }

    class OrderItem {
        name
        description
    }

    Customer --> Order     : places
    Order    --> OrderItem : includes
```


[mer]: https://mermaid.js.org/
