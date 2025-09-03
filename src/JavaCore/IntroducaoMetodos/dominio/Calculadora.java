package JavaCore.IntroducaoMetodos.dominio;

/**
 * Esta classe é o 'molde' ou 'planta' de uma Calculadora.
 * Ela define o comportamento que todos os objetos do tipo Calculadora terão.
 */
public class Calculadora {

    /**
     * Este é um método que define a ação de somar dois números.
     * Métodos são blocos de código que executam uma tarefa específica.
     */
    public void somaDoisNumeros() {
        // O código dentro do método é executado quando ele é chamado.
        System.out.println("A soma dos dois números é: " + (10 + 10));
    }

    public void subtraiDoisNumeros() {
        System.out.println("A subtração dos dois números é: " + (10 - 5));
    }
}