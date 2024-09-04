import java.util.Scanner;
public class Algoritmo6 {
	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
	double a,b,c;
	
	System.out.println("Digite o primeiro Valor");
	a=ler.nextDouble();
	System.out.println("Digite o segundo Valor");
	b=ler.nextDouble();
	System.out.println("Digite o terceiro Valor");
	c=ler.nextDouble();
	
	if(a<b && a<c) {
		if(b<c) {
			System.out.println(a+" "+b+" "+c);
		}
		else {
			System.out.println(a+" "+c+" "+b);
		}
	}
	else if(b<a && b<c) {
		if(a<c) {
			System.out.println(b+" "+a+" "+c);
		}
		else {
			System.out.println(b+" "+c+" "+a);
		}
	}
	else if (c<a && c<b) {
		if(a<b) {
			System.out.println(c+" "+a+" "+b);
		}
		else {
			System.out.println(c+" "+b+" "+a);
		}
	}
	ler.close();
	}
}
