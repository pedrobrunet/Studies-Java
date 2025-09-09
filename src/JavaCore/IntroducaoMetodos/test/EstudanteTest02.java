package JavaCore.IntroducaoMetodos.test;

import JavaCore.IntroducaoMetodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Gustavo";
        estudante01.idade = 19;
        estudante01.sexo = 'M';

        estudante02.nome = "Ana";
        estudante02.idade = 18;
        estudante02.sexo = 'F';
    }
}
