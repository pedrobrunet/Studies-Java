package JavaCore.IntroducaoMetodos.test;

import JavaCore.IntroducaoMetodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new  Calculadora();
        // Chama o método 'divideDoisNumeros' e armazena o valor retornado na variável 'resultado'.
        // O tipo da variável (double) deve corresponder ao tipo de retorno do método.
        double resultado = calculadora.divideDoisNumeros(20, 10);
        System.out.println("O resultado da divisão é: " + resultado);
    }

}
