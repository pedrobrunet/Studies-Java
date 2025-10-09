package Introducao;
public class TryCatch {
public static void main(String[] args) {
    
//TRY CATCH - TRATAR ERROS
    int[] numeros = {1,2,3};
    try {
        System.out.println(numeros[10]);
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Erro ao acessar o índice do array: " + e.getMessage());
    }

    System.out.println("Programa continua executando normalmente...");
    // EXEMPLO DE CODIGO QUE PODE GERAR ERRO
    // O TRY TENTA EXECUTAR O CÓDIGO
    // SE DER ERRO, O CATCH CAPTURA O ERRO E TRATA

    // O BLOCO TRY/CATCH PODE CONTER VÁRIOS CATCH, CORRESPONDENDO A DIFERENTES TIPOS DE EXCEÇÕES
}
}
