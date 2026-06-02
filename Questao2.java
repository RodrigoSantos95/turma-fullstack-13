import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("\nFaturamento de sanemento básico\n");
        System.out.print("\nForneça o volume consumido em m³ ");
        double volumeConsumido = scn.nextDouble();
        
        scn.close();
    }
}