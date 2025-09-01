package Introducao;

public class Arrays {
    public static void main(String[] args) {
        // --- Exemplo de Array Simples ---
        int[] idades = new int[3];
        idades[0] = 20;
        idades[1] = 15;
        idades[2] = 30;
        System.out.println(idades[1]);
        System.out.println(idades[2]);
        System.out.println(idades[0]);

        String[] nomes = new String[3];
        nomes[0] = "João";
        nomes[1] = "Maria";
        nomes[2] = "Pedro";

        System.out.println("--- Array 'numeros' ---");
        int[] numeros = {1, 2, 3, 4, 5};
        System.out.println(numeros[3]);

        for (int numero : numeros) {
            System.out.println(numero);
        }

        // --- Exemplo de Array Multidimensional 1 ---
        System.out.println("--- Array 'times' ---");
        String[][] times = new String[3][3];
        times[0][0] = "Vasco";
        times[0][1] = "Flamengo";
        times[0][2] = "Botafogo";
        times[1][0] = "Fluminense";
        times[1][1] = "Corinthians";
        times[1][2] = "Palmeiras";

        for (String[] linha : times) {
            for (String time : linha) {
                if (time != null) {
                    System.out.println(time);
                }
            }
        }

        // --- Exemplo de Array Multidimensional 2 ---
        // Este bloco foi movido para fora do loop anterior.
        System.out.println("\n--- Exemplo de Array Multidimensional 'arrayInt' ---");
        int[][] arrayInt = {{1, 2}, {1, 2, 3, 4}, {1, 2, 3, 4, 5, 6}};
        for (int [] linhaInt : arrayInt) {
            System.out.println("\n--- Nova Linha ---");
            for (int num : linhaInt) {
                System.out.println(num);
            }
        }
    }
}