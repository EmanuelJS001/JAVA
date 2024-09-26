import java.util.Scanner;
public class ImparPar {
	public static void main(String[] args) {
		int resto, n;
		Scanner ler=new Scanner(System.in);
		
		System.out.println("Digite um número inteiro");
		n=ler.nextInt();
		resto=n%2;
		if (resto==0) {
			System.out.println("O numero é par");
		}else {
			System.out.println("O numero é impar");
		}
		ler.close();
	}
}
