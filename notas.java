import java.util.Scanner;
public class Nota {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double nota1 = 0, nota2 = 0, media = 0;

        System.out.println("Qual a nota1:");
        nota1 = ler.nextDouble();

        System.out.println("Qual a nota2:");
        nota2 = ler.nextDouble();

        media = (nota1 + nota2) / 2;

        if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media >= 4 && media < 7) {
            System.out.println("Exame");
        } else {
            System.out.println("Reprovado");
        }
}
}
