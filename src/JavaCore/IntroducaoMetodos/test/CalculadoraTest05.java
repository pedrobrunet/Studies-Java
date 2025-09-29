package JavaCore.IntroducaoMetodos.test;

import JavaCore.IntroducaoMetodos.dominio.Calculadora;

public class CalculadoraTest05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1,2,3,4,5};


        calculadora.somaArray(numeros);
        // Varargs
        calculadora.somaVarArgs(1,4,5,7);

    }
}
