import java.util.Scanner;
public class Ex2 {
	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		int nasc, id;
	
		System.out.println("digite o ano de nascimento");
		nasc=ler.nextInt();
		id=2024-nasc;	
		if (id<6) {
			System.out.println("Dente de leite");
		} else if (id<10) {
			System.out.println("infantil 1");
		} else if (id<14) {
			System.out.println("infantil 2");
		} else if (id<16) {
			System.out.println("juvenil 1");
		} else if (id<17) {
			System.out.println("juvenil 2");
		} else {
			System.out.println("A escola nao aceita alunos com 18 anos ou mais");
		}
			
		ler.close();
	
	}
}
