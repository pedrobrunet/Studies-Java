public class Cliente {
    Double limiteCredito = 10.0;
    String nome;

    // classes e métodos que são instanciados
    
    public void solicitarLimiteCredito(Double valorSolicitado){
        if(valorSolicitado <= limiteCredito){
            System.out.println("Limite aprovado");
        } else {
            System.out.println("Limite não aprovado");
        }
    }

    public void comprar(Double valorProduto){
        limiteCredito -= valorProduto;
        System.out.println("Compra aprovada. Novo limite: " + limiteCredito);
    }
// construtor
    public Cliente(String nomeinformado){
        nome = nomeinformado;
        // para usar o meu nome do atributo, uso o this = this.nome = nome
    }
}
