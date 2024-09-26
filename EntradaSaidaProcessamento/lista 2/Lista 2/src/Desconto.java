import java.util.Scanner;
public class Desconto {
	public static void main(String[] args) {
		double p, precoNovo;
		Scanner ler =  new Scanner(System.in);
		
		System.out.println("Insira o preço do produto em R$");
		p=ler.nextFloat();
		precoNovo=p*0.95;
		System.out.println("O preço com desconto aplicado é de R$"+precoNovo);
		ler.close();
	}
}