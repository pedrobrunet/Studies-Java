package JavaCore.IntroducaoMetodos.test;
/**
 * Esta classe é a nossa classe de teste. Ela usa a classe 'Calculadora'
 * para demonstrar como seus métodos funcionam.
 */
// A linha 'import' é necessária para usar a classe 'Calculadora'
// porque ela está em um pacote diferente.
import JavaCore.IntroducaoMetodos.dominio.Calculadora;
// 1. Instanciamos (criamos) um novo objeto da classe Calculadora.
// O 'calculadora' agora é uma instância real da classe Calculadora.
public class CalculadoraTest01 {
    public static void main(String[] args) {
        // 2. Chamamos o método 'somaDoisNumeros' do nosso objeto 'calculadora'.
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        calculadora.subtraiDoisNumeros();
        System.out.println("__________________________");
        System.out.println("FIM DO PROGRAMA");
        // podemos chamar o método várias vezes se quisermos

    }

}
