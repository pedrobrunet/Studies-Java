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
    // Parametros são variáveis que você pode passar para um método.
    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println("A multiplicação dos dois números é: " + (num1 * num2));
    }

    public double divideDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Divisão por zero não é permitida.");
            return 0;
        } else { // O 'else' garante que a divisão só ocorrerá se não houver erro
            return num1 / num2;
        }
    }

    public void alteraDoisNumeros(int num1, int num2){
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);
    }
}