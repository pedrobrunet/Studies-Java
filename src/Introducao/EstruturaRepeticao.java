package Introducao;

public class EstruturaRepeticao {
    public static void main(String[] args) {
        // while, do...while, for
        int count = 1;
        while (count < 10) {
            System.out.println(++count);
        }

        System.out.println("--------------------");
// for (inicialização; condição; incremento)
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}