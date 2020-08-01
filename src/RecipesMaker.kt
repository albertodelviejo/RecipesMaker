import model.Fruta

fun main(args: Array<String>) {

/* Por ahora no vamos a usar la lista de ingredientes
    var listaIngredientes = mapOf<Int,String>(1 to "Agua", 2 to "Leche", 3 to "Carne", 4 to "Verduras", 5 to "Frutas", 6 to "Cereal", 7 to "Huevos", 8 to "Aceite") 
*/
    var menu: String =
            """:: Bienvenido a Recipe Maker ::

    Selecciona la opción deseada
    1. Hacer una receta
    2. Ver mis recetas
    3. Salir""".trimIndent()

    println(menu)

    var entrada: String? = readLine()

    when (entrada) {
        "1" -> makeRecipe()
        "2" -> viewRecipe()
        "3" -> {
            println("Cerrando Aplicacion")
            System.exit(0)
        }
        else -> println("Debe introducir un numero del 1 al 3")
    }
}

fun makeRecipe() {
    var ingredientesMenu: String =
            """Hacer receta
    Selecciona por categoría el ingrediente que buscas
    1. Agua
    2. Leche
    3. Carne
    4. Verduras
    5. Frutas
    6. Cereal
    7. Huevos
    8. Aceites""".trimIndent()
    println(ingredientesMenu)

    var segundaEntrada: String? = readLine()
    when (segundaEntrada){
        "1" -> ""
        "2" -> ""
        "3" -> ""
        "4" -> ""
        "5" -> {var fruta = Fruta("",1)}
        "6" -> ""
        "7" -> ""
        "8" -> ""
    }
}

fun viewRecipe() {
    println("Ver mis recetas")
}


