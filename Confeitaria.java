import java.util.Scanner;

public class Confeitaria {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("\nConfeitaria Treina Recife\n");
        
        System.out.print("Digite o preço da fatia do bolo R$ ");
        double valorFatia = scn.nextDouble();
        
        System.out.print("Digite o valor disponível na conta R$ ");
        double valorConta = scn.nextDouble();

        double valorDisponível = valorConta - valorFatia;

        if (valorDisponível >=0 ) {
            System.out.print("\nCompra aprovada! Pode saborear o doce!");
        }else{
            valorDisponível = (valorDisponível * -1);
            System.out.printf("\nSaldo insuficiente! Faltam R$ %.2f", valorDisponível);
        }
        scn.close();
    }
}
