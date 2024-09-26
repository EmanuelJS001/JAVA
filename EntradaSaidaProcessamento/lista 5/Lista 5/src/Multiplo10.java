import java.util.Scanner;
public class Multiplo10 {
	public static void main(String[] args) {
		int n, resto;
		Scanner ler=new Scanner(System.in);
		
		System.out.println("Digite um número inteiro");
		n=ler.nextInt();
		resto=n % 10;
		if (resto==0) {
			System.out.println("Esse número é multiplo de 10");
		}else {
			System.out.println("Esse número não é multiplo de 10");
		}
		ler.close();
	}
}
