package JavaCore.teste;
import JavaCore.dominio.Celular;
public class CelularTest01 {
    public static class ClasseTest01 {

        public static void main(String[] args) {

            // --- OBJETOS: AS INSTÂNCIAS ---
            // Um objeto é uma "instância" real de uma classe.
            // Ele é criado a partir do molde da classe.

            // Cria a primeira instância do molde 'Celular' e a atribui à variável 'celular1'
            Celular celular1 = new Celular();
            celular1.cor = "Preto";
            celular1.modelo = "Iphone 13";
            celular1.tamanhoTela = 6.1;
            celular1.ligado = true;

            // Cria uma segunda instância do molde 'Celular', independente da primeira
            Celular celular2 = new Celular();
            celular2.cor = "Branco";
            celular2.modelo = "Samsung Galaxy S22";
            celular2.tamanhoTela = 6.6;
            celular2.ligado = false;

            // Exibindo as informações dos objetos
            System.out.println("Cor do celular 1: " + celular1.cor);
            System.out.println("Modelo do celular 2: " + celular2.modelo);
            System.out.println("Celular 1 está ligado? " + celular1.ligado);
        }
    }
}
