import java.util.Scanner;
public class Idade {
	public static void main(String[] args) {
		int anoA, anoN, id;
		Scanner ler=new Scanner(System.in);
		
		System.out.println("Digite o ano atual ");
		anoA=ler.nextInt();
		System.out.println("Digite o ano de nascimento ");
		anoN = ler.nextInt();
		id=anoA-anoN;
		if (id<10) {
			System.out.println("Criança");
		} else if (id<18) {
			System.out.println("Adolescente");
		} else if (id<60) {
			System.out.println("Adulto");
		} else {
			System.out.println("Idoso");
		}
		ler.close();
	}
}