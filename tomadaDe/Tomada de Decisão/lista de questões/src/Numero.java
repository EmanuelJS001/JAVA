import java.util.Scanner;
public class Numero {
	public static void main(String[] args) {
	Scanner ler=new Scanner(System.in);
	int n,resto;
	System.out.println("digite o número inteiro");
	n=ler.nextInt();
	resto=n%2;
	if(resto==0) {
		System.out.println("seu número é par");
	}
	else {
		System.out.println("seu núemro é impar");
	}
	ler.close();
	}
	
}
