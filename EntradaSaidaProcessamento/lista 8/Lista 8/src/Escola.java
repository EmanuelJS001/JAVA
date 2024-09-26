import java.util.Scanner;
public class Escola {
	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		int anoN, anoA, id;
	
		System.out.println("Insira o ano de nascimento");
		anoN=ler.nextInt();
		anoA=2024;
		id=anoA-anoN;
		if (id<=6) {
		System.out.println("Dente de Leite");
		} else if (id<=10) {
		System.out.println("Infantil I");
		} else if (id<=14) {
		System.out.println("Infantil II");
		} else if (id<=16) {
		System.out.println("Juvenil I");
		} else if (id==17) {
		System.out.println("Juvenil II");
		} else {
		System.out.println("A escola não permite alunos com 18 anos ou mais");
		}
		ler.close();
	}
}
