package JavaCore.IntroducaoMetodos.test;

import JavaCore.IntroducaoMetodos.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.Nome = "paulo";
        funcionario.idade = 17;
        funcionario.salarios = new double[]{1200,400,300};
        funcionario.imprimi();


    }
}
