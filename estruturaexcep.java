import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class estruturaexcep {

    public static void main(String[] args) {
        try{
     //criando o objeto scanner 
     Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
     
     System.out.println("Digite seu nome: ");
     String nome = scanner.next();

     System.out.println("Digite seu sobrenome: ");
     String sobrenome = scanner.next();

     System.out.println("Digite sua idade: ");
     int idade = scanner.nextInt();

     System.out.println("Digite sua altura: ");
     double altura = scanner.nextDouble();

     //imprimindo dados obtidos pelo usuario 
     System.out.println("Olá, me chamo " + nome.toUpperCase() + sobrenome.toUpperCase());
     System.out.println("Tenho " + idade + " anos");
     System.out.println("Minha altura é " + altura + " cm");
     scanner.close();
     //fechamento da scanner
        }
        catch (InputMismatchException estruturaexcep){
            //a exceção que queremos pegar 
            System.out.println("Os campos idade e altura precisam ser numericos");
            //a solução para o usuário
        }
    }
}