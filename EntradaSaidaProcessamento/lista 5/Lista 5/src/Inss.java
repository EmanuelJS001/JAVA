import java.util.Scanner;
public class Inss {
	public static void main(String[] args) {
		double salB, salL, inss;
		Scanner ler=new Scanner(System.in);
		
		System.out.println("Digite o seu salário");
		salB=ler.nextDouble();
		if (salB>=2500) {
			inss=salB*0.11;
			salL=salB-inss;
			System.out.println("O valor do INSS é de R$"+ inss);
			System.out.println("O Salario após o desconto do INSS é de R$"+salL);
		}else {
			inss=salB *0.09;
			salL=salB-inss;
			System.out.println("O valor do INSS é de R$"+inss);
			System.out.println("O Salario após o desconto de inss é de R$"+ salL);
		}
		ler.close();
	}
}
