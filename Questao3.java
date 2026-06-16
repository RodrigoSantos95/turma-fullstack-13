import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        System.out.print("\nConversão de moeda\n");
        
        System.out.print("\nDigite o valor desejado a ser comprado em dólar (USD) $ ");
        double valorDolar = scn.nextDouble();
        
        System.out.print("Digite a cotação oficial atual do dólar ");
        double cotacaoDolar = scn.nextDouble();
        
        System.out.print("Digite a taxa de spread do banco ");
        double txSpread = scn.nextDouble();
        
        double valorTotal;
        double cotacaoAplicada;
        
        if (txSpread > 0 && txSpread <= 1) {
            cotacaoAplicada = cotacaoDolar * (1+txSpread);
        }else{
            cotacaoAplicada = cotacaoDolar * ((txSpread/100) + 1);
        }

        valorTotal = (valorDolar * cotacaoAplicada);

        System.out.printf("Cotação aplicada: R$ %.2f | Total BRL: R$ %.2f", cotacaoAplicada, valorTotal);

        scn.close();    
    }
}