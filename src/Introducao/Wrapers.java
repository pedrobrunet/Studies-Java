package Introducao;

public class Wrapers {
    // WRAPERS - CLASSES QUE REPRESENTAM TIPOS PRIMITIVOS
    // int - Integer
    // double - Double
    // float - Float
    // char - Character
    // boolean - Boolean
    // long - Long
    // short - Short
    // byte - Byte
    // uma vez criado o objeto ele não pode ser alterado (imutabilidade)

    public static void main(String[] args) {
        double valorDouble =10.5;
        int valorInt = (int) valorDouble; // CASTING - CONVERSÃO EXPLÍCITA
        System.out.println("Valor int: " + valorInt);

        // USANDO WRAPERS
        Double d = 123.33;
        Integer i = d.intValue(); // CONVERTENDO DOUBLE PARA INTEGER
        System.out.println("Valor Integer: " + i);

        // PARSE - CONVERTENDO STRING PARA TIPO PRIMITIVO
        String s = "100";
        int numero = Integer.parseInt(s); // CONVERTENDO STRING PARA INT    
        System.out.println("Número: " + numero);

        // EXPLICAÇÃO SOBRE IMPORT
        java.util.Date data = new java.util.Date(); // USANDO A CLASSE DATE DO PACOTE JAVA.UTIL
        // IMPORT É USADO PARA EVITAR ESPECIFICAR O PACOTE COMPLETO TODA VEZ QUE USAMOS A CLASSE
        // EXEMPLO: import java.util.Date; NO INÍCIO DO ARQUIVO
        // ASSIM PODEMOS SIMPLESMENTE USAR Date data = new Date();
    }
    
}
