import java.util.Scanner;
public class AnosMeses {
	public static void main(String[] args) {
		float dias, anos, meses;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o numero de dias");
		dias=ler.nextFloat();
		anos=dias/365;
		meses=dias/30;
		System.out.println("O numero de dias convertido em anos é "+anos);
		System.out.println("O numero de dias convertido em meses é "+meses);
		ler.close();
	}
}