package model

abstract class Ingrediente {
    var name: String
    var quantity: Int

    constructor(name: String, quantity: Int) {
        this.name = name
        this.quantity = quantity
    }


}