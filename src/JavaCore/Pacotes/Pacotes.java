package JavaCore.Pacotes;

public class Pacotes {
    // Model - Classes que representam a camada e modelo da aplicação: Cliente, Produto, Pedido
    // repository - Classes ou interfaces que possuem a finalidade de interagir com o banco de dados: ClienteRepository, ProdutoRepository
    // service - Classes que contém regras de negocio do sistema: ClienteService possui o método validar CPF, do cliente cadastrado;
    // controller - classes que possuem a finalidade de disponibilizar os nossos recursos da aplicação,, para outras aplicações via HTTP
    //view- classes que possuem alguma interação, com a interface do usuário
    // util- Pacote que contém classes utilitárias do sistema: formatadorNumeroUtil, ValidadorUtil;

    // exemplo de tree de pacotes
    /*src
└── main
    └── java
        └── com
            └── minhaempresa
                └── projeto  <-- Pacote Raiz da Aplicação
                    
                    ├── model
                    |   ├── Cliente.java
                    |   ├── Produto.java
                    |   └── Pedido.java
                    |
                    ├── repository
                    |   ├── ClienteRepository.java  // Interação com o DB (Ex: JPA/JDBC)
                    |   └── ProdutoRepository.java
                    |
                    ├── service
                    |   ├── ClienteService.java     // Contém a regra de negócio (Ex: validar CPF)
                    |   └── ProdutoService.java
                    |
                    ├── controller
                    |   ├── ClienteController.java  // Recebe requisições HTTP (API REST)
                    |   └── ProdutoController.java
                    |
                    ├── util
                    |   ├── FormatadorNumeroUtil.java
                    |   └── ValidadorUtil.java
                    |
                    └── view
                        └── TelaPrincipal.java     // (Se houver interface gráfica/terminal) */

}
  