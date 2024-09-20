import java.util.Scanner;
public class Imc {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double p, a, imc;
		System.out.println("digite o seu peso em quilos");
		p=ler.nextDouble();
		System.out.println("digite a sua altura em metros ");
		a=ler.nextDouble();
		imc=p/(a*a);
		if (imc<18.5) {
			System.out.println("o seu I.M.C é "+imc+" você está classificado em excesso de magreza");
		} else if (imc<25) {
				System.out.println("o seu I.M.C é "+imc+" você está classificado em peso normal");
		} else if (imc<30) {
					System.out.println("o seu I.M.C é "+imc + "você está classificado em excesso de peso");
		} else if (imc<35) {
			System.out.println("o seu I.M.C é "+imc+" você está classificado em obesidade (grau 1)");
		} else if (imc<40) {
			System.out.println("o seu I.M.C é "+imc+" você está classificado em obesidade (grau 2)");
		} else {
			System.out.println("o seu I.M.C é "+imc+" você está classificado em obesidade (grau 3)");
		}
	ler.close();	
	}
}
