import java.util.Scanner;
public class Eleicao {
	public static void main(String[] args) {
		int id, anoNasc, anoE;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o seu ano de nascimento:");
		anoNasc=ler.nextInt();
		System.out.println("Digite o ano da eleição:");
		anoE=ler.nextInt();
		id=anoE-anoNasc;
		if (id < 16) {
			System.out.println("Você terá "+id+" anos de idade e não poderá votar");
		}else {
			System.out.println("Você terá "+id+" anos de idade e poderá votar");
		}
		ler.close();
	}
}
