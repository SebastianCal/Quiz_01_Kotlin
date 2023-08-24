fun main(args: Array<String>) {
    /*
    println("BIENVENIDO A SISTEMA DE COBRO DE TRASPORTE")
    println("Para iniciar con el sistema de cobro por favor ingrese el numero de trayectos que va arealizar el cliente")
    var n_tra = readln()
    var tray = 8500
    println("Continuando con el proceso por favor digite la edad del cliente en años: ")
    var edad = readln().toInt()
    var descto = 0.45

    if (edad >= 60){
        println("La persona aplica para un descuento, preguntar si desea aceptar el descuento")
        var acep_desc = readln()
        if (acep_desc == "SI"){
            var total = (n_tra.toInt() * tray) * descto
            println("El total a cobrar es de $total")
        }else if (acep_desc == "NO"){
            var total = n_tra.toInt() * tray
            println("El total a cobrar es de $total")
        }else{
            var total = n_tra.toInt() * tray
            println("El total a cobrar es de $total")
        }

    }else{
        var total = n_tra.toInt() * tray
        println("El total a cobrar es de $total")
    }

     */

    println("LISTA NOTAS ESTUDIANTES")
    var notas = arrayListOf<Double>(5.0, 3.0, 3.5, 1.5, 4.7, 2.0, 1.0, 3.2, 2.9)
    //println(notas.size)
    notas.forEach{doc ->
        println(doc)
    }

    val sum = notas.sum()
    val prom = sum / notas.size
    println("El promedio egenral del curso es del : $prom")

    val nota_alta = notas.maxOrNull()
    println("La nota mas alta del salon es: $nota_alta")

    val  nota_baja = notas.minOrNull()
    println("La nota mas baja del salon es: $nota_baja")

    val prommenores = notas.filter { it < 3.5 }
    val promedio = prommenores.average()
    println("El promedio de notas menores que 3.5 es de: $promedio")


}



