fun main (args: Array<String>){

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

    var entrada:String? = readLine()

    when (entrada){
        "1" ->  println("Ha seleccionado: Hacer una receta")
        "2" ->  println("Ha seleccionado: Ver mis recetas")
        "3" ->  {println("Cerrando Aplicacion")
        System.exit(0)}
        else -> println("Debe introducir un numero del 1 al 3")
    }
}
