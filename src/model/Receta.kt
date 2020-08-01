package model

class Receta(){
    var ingredientes = mutableListOf<String>("")

    fun addIngredient(ingrediente: String){
        ingredientes.add(ingrediente)
    }

    fun getIngredients(): MutableList<String> {
        return ingredientes
    }
}