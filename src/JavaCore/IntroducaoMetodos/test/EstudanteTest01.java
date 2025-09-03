package JavaCore.IntroducaoMetodos.test;

import JavaCore.IntroducaoMetodos.dominio.Estudante;
import JavaCore.IntroducaoMetodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Gustavo";
        estudante01.idade = 19;
        estudante01.sexo = 'M';

        estudante02.nome = "Ana";
        estudante02.idade = 18;
        estudante02.sexo = 'F';

        // Imprime os detalhes do estudante01 diretamente no método main
        System.out.println("Estudante 01: " + estudante01.nome + ", " + estudante01.idade + ", " + estudante01.sexo);
        System.out.println("-------------------------------");
        // Imprime os detalhes do estudante02 usando o método estático da classe ImpressoraEstudante
        ImpressoraEstudante.imprime(estudante02);
    }
}
