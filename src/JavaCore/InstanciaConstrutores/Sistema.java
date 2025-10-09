public class Sistema {
    public static void main(String[] args) {

        // instancia o objeto
        Cliente Glayson = new Cliente("Glayson");
        System.out.println("Nome do cliente: " + Glayson.nome);
        Glayson.solicitarLimiteCredito(5.0);
        Glayson.comprar(2.0);
        Glayson.solicitarLimiteCredito(8.0);
    
        Cliente Iza = new Cliente("Iza");
        System.out.println("Nome do cliente: " + Iza.nome);
        Iza.solicitarLimiteCredito(7.0);
        Iza.comprar(3.0);
        Iza.solicitarLimiteCredito(5.0);
    }
}
