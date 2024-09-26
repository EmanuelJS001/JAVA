import java.util.Scanner;
public class AnoBi {
	public static void main(String[] args) {
		int anoNasc, resto;
		Scanner ler=new Scanner(System.in);
		
		System.out.println("Digite o seu ano de nascimento");
		anoNasc=ler.nextInt();
		resto=anoNasc%4;
		if (resto==0) {
			System.out.println("Você nasceu em um ano bissexto");
		} else {
			System.out.println("Você não nasceu em um ano bissexto");
		}
		ler.close();
	}
}
