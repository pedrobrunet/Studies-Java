package Introducao;

public class Metodos {
    // MÉTODOS - FUNÇÕES DENTRO DE UMA CLASSE
    // TIPOS DE MÉTODOS
    // void - não retorna nada
    // com retorno - retorna um valor

    // sempre que o metodo não for void, é obrigatório o uso do return
    public double somar(double a, double b) {
        return a + b;
    }

    public void imprimir(String texto) {
        System.out.println(texto);
    }

    public double dividir(double a, double b) throws Exception{
       // throws exception - tratamento de erro
       // pode ser usado para lançar uma exceção
    }

    public void gravarCliente(String nome, String email, String cpf) {
        // código para gravar cliente
        // metodo com a finalidade de gravar cliente
    }

    public void gravarCliente(Cliente cliente) {
    
    }
}
