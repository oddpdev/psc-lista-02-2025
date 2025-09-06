import java.util.Scanner;

public class AtividadeNumero2
{
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println ("Escreva um número:");
        int NumeroUm = scanner.nextInt();
        System.out.println ("O número informado foi " + NumeroUm + ".");
        
        System.out.println ("Escreva o segundo número:");
        int NumeroDois = scanner.nextInt();
        System.out.println ("O segundo número escolhido é " + NumeroDois + ".");
        
        int soma=(NumeroUm+NumeroDois);
        int subtração=(NumeroUm-NumeroDois);
        int multiplicação=(NumeroUm*NumeroDois);
        
        System.out.println ("O resultado da soma é " + soma + ", a subtração é " + subtração + " e a multiplicação é " + multiplicação + ".");
        
        scanner.close ();
        
    }
}