import java.util.Scanner;
public class Gasolina {
	public static void main(String[] args) {
		double km, c, r;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite a distancia percorrida em KM");
		km=ler.nextDouble();
		System.out.println("Digite o total de combustivel gasto durante o percurso");
		c=ler.nextDouble();
		r=km/c;
		if (r >= 10) {
			System.out.println("O carro é econômico");
		} else {
			System.out.println("O carro não é econômico");
		}
		ler.close();
	}
}