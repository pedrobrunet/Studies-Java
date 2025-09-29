package JavaCore.IntroducaoMetodos.dominio;

public class Funcionario {
 public String Nome ;
 public int idade;
 public double [] salarios;

 public void imprimi(){
     System.out.println(this.Nome);
     System.out.println(this.idade);
     for (double salario: salarios){
         System.out.println(salario );
     }
     imprimiMediaSalario();
    }

    public void imprimiMediaSalario (){
     double media = 0;
     for (double salario : salarios){
         media += salario;
     }
     media /= salarios.length;
        System.out.println("\nmedia dos salarios = " + media);
    }

}
