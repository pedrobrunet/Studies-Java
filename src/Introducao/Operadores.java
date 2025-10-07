package Introducao;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Operadores {
    public static void main(String[] args) {
// Introducao.Operadores de Atribuição
        int numero = 10;
        int numero2 = 20;
        System.out.println(numero2 + numero);
// Introducao.Operadores Aritméticos
// + - * / %
        boolean is5maiorQue10 = 5 > 10;
        System.out.println(is5maiorQue10);
        boolean is5menorQue10 = 5 < 10;
        System.out.println(is5menorQue10);
// && (AND) || (OR) ! (NOT)
        int idade = 18;
        float altura = 1.75f;
        boolean isEstudante = idade >= 18 && altura <= 1.5f;
        System.out.println("isEstudante: " + isEstudante);

// = Atribuição += -= *= /= %=
        double bonus = 1800;
        bonus += 1000; // bonus = bonus + 1000
        bonus -= 1000; // bonus = bonus - 1000
        bonus *= 2;    // bonus = bonus * 2
        bonus /= 2;    // bonus = bonus / 2
        bonus %= 2;    // bonus = bonus % 2
        System.out.println("bonus: " + bonus);

        int contador = 0;
        contador += 1; // contador = contador + 1
        contador++;    // contador = contador + 1
        System.out.println(contador);

        // operadores relacionais
        // == != > < >= <=
        int izaIdade = 1;
        boolean maiorDeIdade = izaIdade >= 18;
        System.out.println("iza é maior de idade? " + maiorDeIdade);


        }

    }
