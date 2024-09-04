import java.util.Scanner; 
public class Ex1 {
	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		double va, cash;
		System.out.println("digite o valor da sua compra");
		va=ler.nextDouble();
		if (va<=100) {
			cash=va*0.05;
			System.out.println("seu cashback é de "+ cash+ "R$");
		} else if (va<=1000) {
			cash=va*0.08;
			System.out.println("seu cashback é de "+ cash+ "R$");
		} else if (va<=2000) {
			cash=va*0.10;
			System.out.println("seu cashback é de "+ cash+ "R$");
		} else if (va<=5000) {
			cash=va*0.125;
			System.out.println("seu cashback é de "+ cash+ "R$");
		} else {
			cash=va*0.15;
			System.out.println("seu cashback é de "+ cash+ "R$");
		}
		ler.close();
	} 
			
}
