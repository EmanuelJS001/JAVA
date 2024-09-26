import java.util.Scanner;
public class Dependentes {
	public static void main(String[] args) {
		int sal, salF, bene, dep;
		Scanner ler=new Scanner(System.in);
		
		System.out.println("Digite o seu salário em R$");
		sal = ler.nextInt();
		System.out.println("Digite o número de dependentes");
		dep=ler.nextInt();
		bene=dep*55;
		salF=sal+bene;
		System.out.println("Seu salario mais o beneficio por dependentes é de R$"+salF);
		ler.close();
	}
}