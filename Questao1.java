import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("\nFolha de pagamento\n");
        System.out.println("\nDigite a quantidade de horas trabalhadas no mês: ");
        double qdtHoras = scn.nextDouble();
        scn.close();
    }
}
