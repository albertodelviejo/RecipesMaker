package model

class Fruta(name: String, quantity: Int, receta: Receta) : Ingrediente(name,quantity){

    var frutas = hashMapOf<String,String>("1" to "Fresa", "2" to "Plátano", "3" to "Uvas", "4" to "Manzana", "5" to "Naranja", "6" to "Pera", "7" to "Cereza")

    init {
        var frutaMenu: String =
                """
    Selecciona la fruta
    1. Fresa
    2. Plátano
    3. Uvas
    4. Manzana
    5. Naranja
    6. Pera
    7. Cereza""".trimIndent()
        println(frutaMenu)

        var entrada: String? = readLine()
        receta.addIngredient(selectInput(entrada))
    }

    fun selectInput(entrada: String?) : String{
        return "Ha seleccionado ${frutas.get(entrada)}"
    }

}