package Introducao.ex;

public class EX03  {
    public static void main(String[] args) {
        double valorcarro = 38000;
        for (int valorparcela = 1; valorparcela < valorcarro ; valorparcela++ ) {
            double valorfinal = valorcarro / valorparcela;
            if (valorfinal < 1000) {
                break;
            }
            System.out.println("O valor da parcela é: " + valorfinal + " e o número de parcelas é: " + valorparcela);

        }

    }
}
