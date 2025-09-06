import java.util.Scanner;

public class AtividadeNumero5 {
    public static void main (String [] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Qual o valor da diária em cada país?");
        System.out.println("Alemanha:");
        double diariaAlemanha = scanner.nextDouble ();
        System.out.println("Portugal:");
        double diariaPortugal = scanner.nextDouble ();
        System.out.println("Itália:");
        double diariaItalia = scanner.nextDouble ();
        
        System.out.println("Quantas pessoas serão?");
        int pessoas = scanner.nextInt ();
        
        System.out.println("Quantos dias serão de estádia em cada país?");
        System.out.println("Alemanha:");
        int Alemanha = scanner.nextInt ();
        System.out.println("Portugal:");
        int Portugal = scanner.nextInt ();
        System.out.println("Itália:");
        int Italia = scanner.nextInt ();
        
        double totalAlemanha = (Alemanha*diariaAlemanha);
        double totalPortugal = (diariaPortugal*Portugal);
        double totalItalia = (diariaItalia*Italia);
        
        System.out.println("A diária total do grupo é de R$" + (totalAlemanha+totalPortugal+totalItalia) + " e a diária total por pessoa é de R$" + ((totalAlemanha+totalPortugal+totalItalia)/ pessoas) + ".");
        
        scanner.close();
    }
}