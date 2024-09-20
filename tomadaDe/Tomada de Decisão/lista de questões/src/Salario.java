import java.util.Scanner;
public class Salario {
	public static void main(String[] args) {
	Scanner ler=new Scanner(System.in);
	double salario,dividas,saldo;
	
	System.out.println("Digite o seu salário");
	salario = ler.nextDouble();
	System.out.println("Digite o total de suas dividas");
	dividas = ler.nextDouble();
	saldo = salario-dividas;
	
	if(saldo>0) {
		System.out.println("Você terá um saldo positivo de : " + saldo);
	}
	else{
		System.out.println("Você terá um saldo negativo de : " + saldo);
	}
	ler.close();
	}
}
