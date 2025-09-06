import java.util.Scanner;

public class AtividadeNumero4 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        double gasolina=4.75;
        
        System.out.println ("Quantos litros serão/foram abastecidos? Informo o valor do litro inteiro.");
        double litros =scanner.nextInt();
        double total = (gasolina*litros);
        
        System.out.println ("O valor total é R$" + total + ".");
        
        scanner.close();
    }
}