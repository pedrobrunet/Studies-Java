package Introducao;

public class EstruturasCondicionais {

    public static void main(String[] args) {

        int idade = 16;
        // Estrutura condicional if
        if (idade >= 20) {
            System.out.println("Você é maior de idade.");
            // Estrutura  condicional if...else
        } else {
            System.out.println("Você é menor de idade.");
        }

        // Switch case
        // valores usavel = char, byte, short, int, enum, String
        byte dia = 10;
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Dia inválido.");
                break;
        }
    }
}