package Introducao.ex;

public class ex02 {
    public static void main(String[] args) {
        for (int i = 0; i < 1000000; i+= 2 ) {
            System.out.println(i);

        }

     // ou

        for (int i = 0; i < 1000000 ; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }

        }
    }
}
