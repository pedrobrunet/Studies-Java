package Introducao.ex;

import java.text.NumberFormat;

public class ExExcecao {
    public static void main(String[] args) {
        try {
            Number valor = Double.valueOf("a1.75");

            valor = NumberFormat.getInstance().parse("a1.75");

            System.out.println("Valor: " + valor);
        } catch (Exception ex) {
            System.err.println("Erro ao converter a string para número: " + ex.getMessage());
        }
    }
}
