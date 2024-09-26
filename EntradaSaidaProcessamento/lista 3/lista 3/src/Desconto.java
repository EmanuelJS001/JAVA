import java.util.Scanner;
public class Desconto {
	public static void main(String[] args) {
		double preco, precoF, porc, desc, calc;
		Scanner ler=new Scanner(System.in);
		
		System.out.println("Insira o preço total do produto em R$");
		preco=ler.nextFloat();
		System.out.println("Insira o desconto do produto em %");
		porc=ler.nextFloat();
		calc=porc/100;
		desc=preco*calc;
		precoF=preco-desc;
		System.out.println("O preço do produto com desconto é de R$"+precoF);
		ler.close();
	}
}