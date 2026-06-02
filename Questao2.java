import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("\nFaturamento de sanemento básico\n");
        
        System.out.print("\nForneça o volume consumido em m³ ");
        double volumeConsumido = scn.nextDouble();
        
        System.out.printf("\nForneça o valor do m³ R$ ");
        double valorVolume = scn.nextDouble();
        
        System.out.printf("\nForneça o valor da tarifa fixa R$ ");
        double tarifaFixa = scn.nextDouble();
        
        System.out.printf("\nForneça o percentual da taxa de esgoto ");
        double txEsgoto = scn.nextDouble();

        double subtotal = (volumeConsumido * valorVolume) + tarifaFixa;
        double valorTotal;
        if (txEsgoto > 0 && txEsgoto <= 1) {
            valorTotal = subtotal * (1 + txEsgoto);
        }else{
            valorTotal = subtotal * ((txEsgoto/100) + 1);
        }
        
        System.out.printf("Subtotal R$ %.2f | Total a pagar R$ %.2f", subtotal, valorTotal);
        scn.close();
    }
}