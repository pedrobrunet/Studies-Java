package Introducao;

import java.util.Random;

public class EstruturaRepeticao {
    public static void main(String[] args) {
        // while, do...while, for
        int count = 1;
        // Sempre usar o while- Enquanto
        while (count < 10) {
            System.out.println(++count);
        }

        System.out.println("--------------------");
// for (inicialização; condição; incremento)
// Sempre usar o for para - Para
// for conceito - for(bloco de inicialização; expressão booleana; atualização)
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        String[] nomes = {"Felipe", "Maria", "João"};
        for(int x=0;x<nomes.length;x++){
            System.out.println("O nome no indice x = " + x + " é: " + nomes[x]);
        }

        // for each - para cada
        for (String nome : nomes) {
            System.out.println("O nome é: " + nome);
        }
System.out.print("--------------------");
        // do...while - faça...enquanto

      do {
      // executando repetidas vezes até alguém atender
      System.out.println("Telefone tocando");
    } while(tocando());

    System.out.println("Alô !!!");
    
  }

  private static boolean tocando() {
    boolean atendeu = new Random().nextInt(3)==1;
    System.out.println("Atendeu? " + atendeu);
    // negando o ato de continuar tocando
    return ! atendeu;
  }
    }
