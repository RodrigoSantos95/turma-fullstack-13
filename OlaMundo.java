import java.util.Scanner;

public class OlaMundo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Olá, mundo!");
        System.out.println("Digite o nome da pessoa: ");
        String nomePessoa = scn.nextLine();
        System.out.println("O nome da pessoa é: " + nomePessoa);
        scn.close();
    }
}
