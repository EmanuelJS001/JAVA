import java.util.Scanner;
public class Raiz {
	public static void main(String[] args) {
		double a, b, c, del, raiz, x1, x2;
		Scanner ler=new Scanner(System.in);
		
		System.out.println("Digite o valor a A");
		a=ler.nextDouble();
		System.out.println("Digite o valor a b");
		b=ler.nextDouble();
		System.out.println("Digite o valor a c");
		c=ler.nextDouble();
		del=(b*b)-4*(a*c);
		if (del<0)  {
			System.out.println("a raiz da equação é inexistente");
		} else if (del==0) {
			raiz=(-b-Math.sqrt(del))/(2*a);
			System.out.println("Sua equação só contém uma raiz"+raiz);
		} else {
			x1=(-b+ Math.sqrt(del))/(2*a);
			x2=(-b- Math.sqrt(del))/(2*a);
			System.out.println("As raizes da sua equações são "+x1+","+x2);
		}
		ler.close();
	}
}