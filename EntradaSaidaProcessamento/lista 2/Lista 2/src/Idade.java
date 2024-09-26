import java.util.Scanner;
public class Idade {
	public static void main(String[] args) {
		int anoA, anoN, id;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Insira o ano atual:");
		anoA=ler.nextInt();
		System.out.println("Insira o seu ano de nascimento:");
		anoN=ler.nextInt();
        id=anoA - anoN;
        System.out.println("A sua idade é de "+id+" anos");
        ler.close();
	}
}