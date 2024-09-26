import java.util.Scanner;
public class Inss {
	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		Double renda, ali;
		
		System.out.println("Informe a sua renda em R$");
		renda= ler.nextDouble();
		if (renda<=1420.00) {
			ali=(renda*0.075);
			System.out.println("O valor a ser recolhido é de  R$"+ali);
		} else if (renda<=2666.68 ) {
			ali= (renda*0.09);
			System.out.println("O valor a ser recolhido é de R$"+ali);
		} else if (renda<=4000.03) {
			ali= (renda*0.12);
			System.out.println("O valor a ser recolhido é de R$"+ali);
		} else if (renda<=7786.02) {
			ali= (renda*0.14);
			System.out.println("O valor a ser recolhido é de R$"+ali);
		} else {
			ali= (renda*0.16);
			System.out.println("O valor a ser recolhido é de R$"+ali);
		}
		ler.close();
	}
}