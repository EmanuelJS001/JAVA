import java.util.Scanner;
public class Economia {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double dis, tan, dm;
		System.out.println("digite a distancia percorrida em KM");
		dis=ler.nextDouble();
		System.out.println("digite a capacidade maxima da tanque de combustivel do veiculo em Litros");
		tan=ler.nextDouble();
		dm=dis/tan;
		if (dm>=10) {
			System.out.println("seu carro é econômico");
		}
		else {
			System.out.println("seu carro não é econômico");
		}
		ler.close();
	}
}