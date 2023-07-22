fun main(args: Array<String>) {
    println("Digite el número del tema al que quiere entrar \n1.Operadores \n2.Condicionales \n3.Ciclos")
    val topic:Int = readLine()!!.toInt()
    if(topic==1) {
        println("Entro a los ejercicios de operadores")
        println("Digite el número del ejercicio al que quiere entrar 1-8 y si quiere salir digite el número 99")
        val exercise: Int = readLine()!!.toInt()
        when(exercise){
            1 -> {
                println("Calcular el área de un triángulo.")
                println("Digite la base:")
                val base:Int  = readLine()!!.toInt()
                println("Digite la altura:")
                val height = readLine()!!.toInt()
                val area = (base * height) / 2
                println("El area es: $area")
            }
            2 -> {
                println("Ingresar dos números y sumarlos.")
                println("Digite el primer número")
                val num1:Int = readLine()!!.toInt()
                println("Digite el segundo número")
                val num2:Int = readLine()!!.toInt()
                val suma = num1 + num2
                println("La suma de $num1  y $num2 es $suma")
            }
            3 -> {
                println("Ingresar un número y visualizar el número elevado al cuadrado.")
                println("Digite un número")
                val number:Int = readLine()!!.toInt()
                val potency = number * number
                println("El $number elevado al cuadrado es $potency")
            }
            4 -> {
                println("Escribir un algoritmo que convierta de euros a dólares.")
                print("Digite la cantidad de euros: ")
                val euro:Int = readLine()!!.toInt()
                val dollar = euro * 1.12
                println("$euro euros equivale a $dollar dólares")
            }
            5 -> {
                println("Pida el lado de un cuadrado y muestre el valor del área y del perímetro.")
                println("Digite el lado del cuadrado")
                val side:Int = readLine()!!.toInt()
                val area = side * side
                val perimeter = side * 4
                println("El area del cuadrado es $area y el perimetro es $perimeter")
            }
            6 -> {
                println("Determine el área y el volúmen de un cilindro")
                println("Digite la altura del cilindro")
                val height:Int = readLine()!!.toInt()
                println("Digite el radio de la base del cilindro")
                val radio:Int = readLine()!!.toInt()
                val area = 2 * 3.1416 * radio * (radio + height)
                val volume = (3.1416 * (radio * radio)) * height
                println("El área del cilindro es $area")
                println("El volúmen del cilindro es $volume")
            }
            7 -> {
                println("Área del círculo inscrito.")
                println("Digite el radio de la circunferencia")
                val radio:Int = readLine()!!.toInt()
                println("Digite la longitud de la circunferencia")
                val length:Int = readLine()!!.toInt()
                val area = (3.1416 * radio) * (3.1416 * radio)
                println("El área del circulo es $area")
            }
            8 -> {
                println("Calcular el promedio de tres números.")
                println("Digite el primer número")
                val num1:Int = readLine()!!.toInt()
                println("Digite el segundo número")
                val num2:Int = readLine()!!.toInt()
                println("Digite el tercer número")
                val num3:Int = readLine()!!.toInt()
                val average = (num1 + num2 + num3) / 3
            }
            else -> {
                print("Ha salido del programa")
            }
        }
    }
    else if(topic==2) {
        println("Entro a los ejercicios de condicionales")
        println("Digite el número del ejercicio al que quiere entrar 1-7 y si quiere salir digite el número 99")
        val exercise: Int = readLine()!!.toInt()
        when(exercise){
            1 -> {
                println("Saber si el número ingresado por teclado es positivo o negativo.")
                println("Digite un número")
                val number:Int = readLine()!!.toInt()
                if(number > 0){
                    println("El $number es un número positivo")
                }
                else{
                    println("El $number es un número negativo")
                }
            }
            2 -> {
                println("Reciba dos números y diga cuál es el mayor y cuál el menor.")
                println("Digite el primer número")
                val num1:Int = readLine()!!.toInt()
                println("Digite el segundo número")
                val num2:Int = readLine()!!.toInt()
                if ((num1 > num2) && (num2 < num1)){
                    println("El $num1 es el número mayor y el $num2  es el número menor")
                }
                else if ((num2 > num1) && (num1 < num2)){
                    println("El $num2 es el número mayor y el $num1 es el número menor")
                }
                else{
                    println("Digito algo mal, intentelo de nuevo")
                }
            }
            3 -> {
                println("Lea tres números enteros positivos y que calcule e imprima en pantalla el menor y el mayor de ellos.")
                println("Digite el primer número")
                val num1:Int = readLine()!!.toInt()
                println("Digite el segundo número")
                val num2:Int = readLine()!!.toInt()
                println("Digite el tercer número")
                val num3:Int = readLine()!!.toInt()
                if((num1 > 0) && (num2 > 0) && (num3 > 0)){
                    if((num1 > num2) && (num1 > num3)){
                        print("El $num1 es el número mayor ")
                    }
                    else if((num2 > num3) && (num2 > num1)){
                        print("El $num2 es el número mayor ")
                    }
                    else if((num3 > num2) && (num3 > num1)){
                        print("El $num3 es el número mayor ")
                    }

                    if((num1 < num2) && (num1 < num3)){
                        println("y el $num1 es el número menor")
                    }
                    else if((num2 < num3) && (num2 < num1)){
                        println("y el $num2 es el número menor")
                    }
                    else if((num3 < num2) && (num3 < num1)){
                        println("y el $num3 es el número menor")
                    }
                }
                else{
                    println("Algún número no es positivo, intentelo de nuevo");
                }
            }
            4 -> {
                println("Dados dos números A y B, sumarlos si A es menor que B o sino restarlos")
                println("Digite el primer número")
                val num1:Int = readLine()!!.toInt()
                println("Digite el segundo número")
                val num2:Int = readLine()!!.toInt()
                if(num1 < num2){
                    val result = num1 + num2
                    println("El resultado de la suma de los números digitados es $result")
                }
                else{
                    val result = num1 - num2
                    println("El resultado de la resta de los números digitados es $result")
                }
            }
            5 -> {
                println("Encontrar el cociente entre A y B. Recordar que la división por cero no está definida, en ese caso debe aparecer una leyenda anunciando que la división no es posible")
                println("Digite el primer número")
                val num1:Int = readLine()!!.toInt()
                println("Digite el segundo número")
                val num2:Int = readLine()!!.toInt()
                if(num2 > 0){
                    val quotient = num1 / num2
                    println("El cociente de la division es $quotient")
                }
                else{
                    println("La división no es posible");
                }
            }
            6 -> {
                println("Dados dos números A y B, sumarlos si al menos uno de ellos es negativo, en caso contrario multiplicarlos.")
                println("Digite el primer número")
                val num1:Int = readLine()!!.toInt()
                println("Digite el segundo número")
                val num2:Int = readLine()!!.toInt()
                if((num1 < 0)||(num2 < 0)){
                    val result = num1 + num2
                    println("El resultado de la suma de los números digitados es $result")
                }
                else{
                    val result = num1 * num2
                    println("El resultado de la multiplicación de los números digitados es $result")
                }
            }
            7 -> {
                println("Escribir un algoritmo que determine si un año es bisiesto o no.")
                println("Digite el año")
                val year:Int = readLine()!!.toInt()
                if((year % 4)==0){
                    println("El año es bisiesto")
                }
                else if(((year % 400) == 0) && ((year % 100) != 0)){
                    println("El año es bisiesto")
                }
                else{
                    println("El año no es bisiesto")
                }
            }
            else -> {
                print("Ha salido del programa")
            }
        }
    }
    else if(topic==3) {
        println("Entro a los ejercicios de ciclos")
        println("Digite el número del ejercicio al que quiere entrar 1-7 y si quiere salir digite el número 99")
        val exercise: Int = readLine()!!.toInt()
        when(exercise){
            1 -> {
                println("Imprimir todos los múltiplos de 3 que hay entre 1 y 100")
                for(i in 3..99 step 3){
                    println(i)
                }
            }
            2 -> {
                println("Imprimir los números impares entre 0 y 100.")
                var i = 0
                while(i <= 100){
                    if((i % 2)!=0){
                       println("$i")
                    }
                    i++
                }
            }
            3 -> {
                println("Imprimir los números pares del 1 al 100.")
                var i = 1
                while(i <= 100){
                    if((i % 2)==0){
                        println(i)
                    }
                    i++
                }
            }
            4 -> {
                println("Imprima por pantalla los cuadrados de los números del 1 al 30.")
                var i = 1
                while(i <= 30){
                    var result = i * i
                    println("$i ^ 2 = $result")
                    i++
                }
            }
            5 -> {
                println("Sume los cuadrados de los cien primeros números naturales mostrando el resultado en pantalla.")
                var i = 1
                var accumulator = 0
                while(i <= 100){
                    var result = i * i
                    accumulator = accumulator + result
                    i++
                }
                println("La suma de los cuadrados de los cien primeros números naturales es $accumulator")
            }
            6 -> {
                println("Dados dos números naturales, el primero menor que el segundo, generar y mostrar todos los\n" +
                        "números comprendidos entre ellos en secuencia ascendente.")
                val number1 = 8
                val number2 = 20
                for(i in number1..number2){
                    println(i)
                }
            }
            7 -> {
                println("Sumar todos los números que se digitan por teclado mientras no sea cero.")
                var accumulator = 0
                do{
                    println("Digite un número (Si el número es 0 no se va sumar)")
                    val number: Int = readLine()!!.toInt()
                    accumulator = accumulator + number
                }while(number!=0)
                println("La suma de los números digitados es $accumulator")
            }
            else -> {
                print("Ha salido del programa")
            }
        }
    }
    else{
        print("El número que digitó es incorrecto")
    }
}