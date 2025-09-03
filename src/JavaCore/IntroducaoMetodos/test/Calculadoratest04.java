package JavaCore.IntroducaoMetodos.test;

import JavaCore.IntroducaoMetodos.dominio.Calculadora;

public class Calculadoratest04
{
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        // no java sempre é passado o valor, nunca a referência
        // ou seja, se alterar o valor dentro do método, o valor original não será alterado
        // isso é diferente de outras linguagens, como C++ e Python
        // onde é possível passar a referência e alterar o valor original
        // em java, para alterar o valor original, é necessário retornar o valor alterado
        int num1 = 10;
        int num2 = 20;
        calculadora.alteraDoisNumeros(num1, num2);
        System.out.println("Dentro do main");
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);
    }
}
