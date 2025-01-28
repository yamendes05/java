import java.util.Scanner;

public class Nota {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double n1 = 0, n2 = 0, opcao = 0, divisao = 0, media = 0, produto = 0, diferenca = 0;

        System.out.println("Qual operação você quer realizar? 1 - Média / 2 - Diferença / 3 - Produto / 4 - Divisão");
        opcao = ler.nextDouble();

        if (opcao == 1) {
            System.out.println("Escreva n1:");
            n1 = ler.nextDouble();
            System.out.println("Escreva n2:");
            n2 = ler.nextDouble();
            media = (n1 + n2) / 2;
            System.out.println("A média é: " + media);
        } 
        else if (opcao == 2) {
            System.out.println("Escreva n1:");
            n1 = ler.nextDouble();
            System.out.println("Escreva n2:");
            n2 = ler.nextDouble();
            if (n1 > n2) {
                diferenca = n1 - n2;
            } else {
                diferenca = n2 - n1;
            }
            System.out.println("A diferença é: " + diferenca);
        } 
        else if (opcao == 3) {
            System.out.println("Escreva n1:");
            n1 = ler.nextDouble();
            System.out.println("Escreva n2:");
            n2 = ler.nextDouble();
            produto = n1 * n2;
            System.out.println("O produto é: " + produto);
        } 
        else if (opcao == 4) {
            System.out.println("Escreva n1:");
            n1 = ler.nextDouble();
            System.out.println("Escreva n2:");
            n2 = ler.nextDouble();
            if (n2 != 0) {
                divisao = n1 / n2;
                System.out.println("A divisão é: " + divisao);
            } else {
                System.out.println("Erro: Divisão por zero.");
            }
        } 
        else {
            System.out.println("Opção inválida");
        }

    }
}
