

import java.util.Scanner;
public class Credito {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double h1=0,h2=0,m1=0,m2=0,soma=0,produto =0;
        System.out.println("Idade do homem 1: ");
        h1 = ler.double.nextDouble();
        System.out.println("Idade do homem 2: ");
        h2 = ler.double.nextDouble();
        
        System.out.println("Idade do mulher 1: ");
        m1 = ler.double.nextDouble();
        System.out.println("Idade da mulher 2: ");
        m2= ler.double.nextDouble();
        double 	mulher_mais_velha = 0,mulher_mais_nova =0,homem_mais_velho =0,homem_mais_novo =0;
        if(h1>h2){
            homem_mais_velho = h1;
		    homem_mais_novo = h2;
        }
        else{
            homem_mais_velho = h2;
            homem_mais_novo = h1;

        }
        if (m1>m2){
            mulher_mais_velha = m1;
            mulher_mais_nova = m2;
        }
        else{
            mulher_mais_velha = m2;
            mulher_mais_nova = m1;
        }
        soma = homem_mais_velho + mulher_mais_nova;
        produto = homem_mais_novo * mulher_mais_velha;
        System.out.println("A soma das idades do homem mais velho com a mulher mais nova é: ", soma);
        System.out.println("O produto das idades do homem mais novo com a mulher mais velha é: ", produto).
    

        

        
}
}