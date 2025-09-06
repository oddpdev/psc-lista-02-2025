import java.util.Scanner;

public class AtividadeNumero3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Informe as 04 pontuações finais dos bimestres de 2024:");
        
        int bimestre1=scanner.nextInt();
        int bimestre2=scanner.nextInt();
        int bimestre3=scanner.nextInt();
        int bimestre4=scanner.nextInt();
        
        int media=((bimestre1+bimestre2+bimestre3+bimestre4)/4);
        
        System.out.println ("A média final é de: " + media + ".");
        
        scanner.close();
    }
}
