import java.util.Scanner;
public class Aumento {
	public static void main(String[] args) {
		double sal, salNovo;
		Scanner ler=new Scanner(System.in);
		
		System.out.println("Digite o salario atual em R$");
		sal=ler.nextDouble();
		salNovo=sal*1.12;
		System.out.println("O salário novo é de R$"+salNovo);
		ler.close();
	}
}