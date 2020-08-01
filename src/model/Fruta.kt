package model

class Fruta(name: String, quantity: Int) : Ingrediente(name,quantity){

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
        println(selectInput(entrada))
    }

    fun selectInput(entrada: String?) : String{
        when (entrada) {
            "1" -> name = "Fresa"
            "2" -> name = "Plátano"
            "3" -> name = "Uvas"
            "4" -> name = "Manzana"
            "5" -> name = "Naranja"
            "6" -> name = "Pera"
            "7" -> name = "Cereza"
            else -> println("Debe introducir un numero del 1 al 7")
        }
        return "Ha seleccionado $name"
    }

}