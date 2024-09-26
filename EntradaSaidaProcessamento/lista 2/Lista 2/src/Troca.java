import java.util.Scanner;
public class Troca {
	public static void main(String[] args) {
		int a, b, c;
		Scanner ler=new Scanner(System.in);
		
		System.out.println("Insira o valor de a");
		a=ler.nextInt();
		System.out.println("Insir o valor de b");
		b=ler.nextInt();
		System.out.println(a+", "+b);
		c=a;
		a=b;
		b=c;
		System.out.println(a+", "+b);
		ler.close();	
	}
}