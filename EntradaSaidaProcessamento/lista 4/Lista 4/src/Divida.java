import java.util.Scanner;
public class Divida {
	public static void main(String[] args) {
		float sal, div, saldo;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Insira o seu salario em R$");
		sal=ler.nextFloat();
		System.out.println("Insira o valor de suas dividas em R$");
		div=ler.nextFloat();
		saldo=sal-div;
		if (saldo>=0) {
			System.out.println("Não possui dividas, seu saldo é de R$"+saldo);
		}else {
			System.out.println("Possui divida, sua divida é de R$"+saldo);
		}
		ler.close();
	}
}
