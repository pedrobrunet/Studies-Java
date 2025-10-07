package Introducao;

public class CondicaoTernaria {
    // Condição ternária
    public static void main(String[] args) {
        int idade = 16;
        String resultado;

        // Estrutura condicional if...else
        if (idade >= 18) {
            resultado = "Maior de idade";
        } else {
            resultado = "Menor de idade";
        }
        System.out.println(resultado);

        // Condição ternária
        String resultado2 = (idade >= 18) ? "Maior de idade" : "Menor de idade";
        System.out.println(resultado2);
    }

}
