fun main(args: Array<String>) {

    println("Qual tipo de conta matemática você deseja realizar?\n" +
            "Soma -> digite 1\n" +
            "Subtração -> digite 2\n" +
            "Multiplicação -> digite 3\n" +
            "Divisão -> digite 4\n")
    var conta = readLine()!!.toInt()

    if(conta == 1){
        println("Digite um número: ")
        var soma1 = readLine()!!.toInt()
        println("Digite outro número: ")
        var soma2 = readLine()!!.toInt()
        soma(soma1,soma2)
    }
    else if(conta == 2){
        println("Digite um número: ")
        var subtracao1 = readLine()!!.toInt()
        println("Digite outro número: ")
        var subtracao2 = readLine()!!.toInt()
        subtracao(subtracao1,subtracao2)
    }
    else if(conta == 3){
        println("Digite um número: ")
        var mult1 = readLine()!!.toInt()
        println("Digite outro número: ")
        var mult2 = readLine()!!.toInt()
        multiplicacao(mult1,mult2)
    }
    else if(conta == 4){
        println("Digite um número: ")
        var divisao1 = readLine()!!.toInt()
        println("Digite outro número: ")
        var divisao2 = readLine()!!.toInt()
        divisao(divisao1,divisao2)
    }else{
        println("Conta inválida")
    }
}
fun soma(num1: Int, num2: Int){
    val resultado = num1 + num2
    println("O resultado é $num1 + $num2 = $resultado")
}
fun subtracao(num1:Int, num2:Int) {
    val resultado = num1 - num2
    println("O resultado é $num1 - $num2 = $resultado")
}
fun multiplicacao(num1:Int, num2:Int) {
    val resultado = num1 * num2
    println("O resultado é $num1 * $num2 = $resultado")
}
fun divisao(num1:Int, num2:Int){
    val resultado = num1 / num2
    println("O resultado é $num1 ÷ $num2 = $resultado")
}


