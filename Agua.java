import java.util.Scanner;

public class Agua {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("\nEmpresa de saneamento Treina Recife\n");

        double volumeTotal = 0;

        for (int i = 0; i < 5; i++){
            System.out.printf("Digite o volume de água bombeado no dia %d ", (i + 1));
            double volume = scn.nextDouble();
            volumeTotal += volume;
        }
        scn.close();

        System.out.printf("Volume total: %.2f", volumeTotal);
    }
}
