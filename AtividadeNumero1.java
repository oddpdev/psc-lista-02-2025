import java.util.Scanner;

public class AtividadeNumero1
{
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println ("Escreva um número:");
        int NumeroUm = scanner.nextInt();
        System.out.println ("O número informado foi " + NumeroUm + ".");
        
        scanner.close ();
        
    }
}