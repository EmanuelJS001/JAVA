import java.util.Scanner;
public class Algoritmo4 {
	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		double a, b, c, delta, x1, x2;
		System.out.println("digite o valor a");
		a=ler.nextDouble();
		System.out.println("digite o valor b");
		b=ler.nextDouble();
		System.out.println("digite o valor c");
		c=ler.nextDouble();
		delta=(b*b)-4*a*c;
		if (delta<0) {
			System.out.println("Não existem raízes reais");
	} else if (delta==0) {
		x1=-b+Math.sqrt(delta);
		System.out.println("existe apenas uma raiz real "+ x1 );
	}else {
		x1=-b+Math.sqrt(delta);
		x2=-b-Math.sqrt(delta);
		System.out.println("exitem duas raizes reais "+x1  +" "+x2);
		}
ler.close();	
	}
}
