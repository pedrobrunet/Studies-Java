package JavaCore.Comparacao;
// quando usar == e quando usar o .equals
public class comparacao {
    public static void main(String[] args) {
        int i1 = 10;
        int i2 = 10;
        System.out.println(i1 == i2); // true, compara valor primitivo

        Integer i3 = 128;
        Integer i4 = Integer.parseInt("128");
        System.out.println(i3.equals(i4)); // equals compara o valor do objeto

    }
    // heap - onde os objetos são armazenados - equals 
    // stack - onde os tipos primitivos são armazenados - ==
}
