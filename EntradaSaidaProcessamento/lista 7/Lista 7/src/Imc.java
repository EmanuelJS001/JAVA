import java.util.Scanner;
public class Imc {
	public static void main(String[] args) {
		double alt, peso, quad, imc;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite a sua altura");
		alt=ler.nextDouble();
		System.out.println("Digite o seu peso");
		peso=ler.nextDouble();
		quad=alt*alt;
		imc=peso/quad;
		if (imc <= 18.5) {
			System.out.println("Exesso de magresa");
		} else if (imc<=25) {
			System.out.println("Peso normal");
		} else if (imc<=30) {
			System.out.println("Exesso de peso");
		} else if (imc<=35) {
			System.out.println("Obesidade grau 1");
		} else if (imc<=40) {
			System.out.println("Obesidade grau 2");
		} else if (imc>40) {
			System.out.println("Obesidade grau 3");
		}
		ler.close();
	}
}