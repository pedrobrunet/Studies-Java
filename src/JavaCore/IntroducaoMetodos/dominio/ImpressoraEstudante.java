package JavaCore.IntroducaoMetodos.dominio;

public class ImpressoraEstudante {
    public static void imprime(Estudante estudante) {
        System.out.println("Nome: " + estudante.nome);
        System.out.println("Idade: " + estudante.idade);
        System.out.println("Sexo: " + estudante.sexo);
    }
}
