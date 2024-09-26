import java.util.Scanner;
public class Cashback {
	public static void main (String[] args){
		Scanner ler = new Scanner(System.in);
		Double comp, cashback;
		
		System.out.println ("Insira o valor da compra");
		comp=ler.nextDouble();
		if(comp<= 100) {
		cashback=(comp*0.05);
		System.out.println("Seu cashback é de R$"+cashback);
		} else if (comp<= 1000) { 
		cashback=(comp*0.08);
		System.out.println("Seu cashback é de R$"+cashback);
		} else if (comp<= 2000) { 
		cashback=(comp*0.10);
		System.out.println("Seu cashback é de R$"+cashback);
		} else if (comp<= 5000) {
		cashback=(comp*0.125);
		System.out.println("Seu cashback é de R$"+cashback);
		} else { 
		cashback=(comp*0.15);
		}
		ler.close();
		System.out.println("Seu cashback é:"+cashback); 
	} 
}