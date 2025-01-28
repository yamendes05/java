import java.util.Scanner;
public class Credito {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double saldo_medio = 0, credito =0;
        System.out.println("Qual seu saldo medio: ");
        saldo_medio = ler.nextDouble();
        if(saldo_medio>400){
            credito = saldo_medio * 0.30
        }
        else if(300 < saldo_medio <= 400){
            credito = saldo_medio * 0.25
        }
        else if(200 < saldo_medio <= 300){
            credito = saldo_medio * 0.20
        }else{
            credito = saldo_medio * 0.10
        }
        System.out.println("O credito é de "+credito)

}
}
/*algoritmo credito 

     real saldo_medio,credito
	

inicio
	escreva("Qual seu saldo medio: ")
	leia(saldo_medio)
	SE saldo_medio > 400:
    		credito = saldo_medio * 0.30
	SENAO 300 < saldo_medio <= 400 ENTÃO
    		credito = saldo_medio * 0.25
	SENAO SE 200 < saldo_medio <= 300 ENTÃO
    		credito = saldo_medio * 0.20
	SENAO
   	 	credito = saldo_medio * 0.10
	FIM-SE
	escreva(credito)
	
fim
*/