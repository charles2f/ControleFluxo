
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            String nome ;
            String sobrenome ;
            int idade ;
            double altura ;

            System.out.println("Digite seu nome: ");
            nome = scanner.nextLine();  // Read user input

            System.out.println("Digite seu sobrenome: ");
            sobrenome = scanner.nextLine();  // Read user input

            System.out.println("Digite sua idade: ");
            idade = scanner.nextInt();  // Read user input

            System.out.println("Digite sua altura: ");
            altura = scanner.nextDouble();  // Read user input  

            System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos");
            System.out.println("Minha altura é " + altura + " cm");
            scanner.close();

        }
        catch (InputMismatchException e) {
            System.out.println("O Campo Idade e Altura precisam ser Numéricos: " + e);
        }
    }   

}
