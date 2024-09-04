import java.util.Scanner;
public class AnoBissexto {
	public static void main(String[] args) {
	int nasc,resto;
	Scanner ler=new Scanner(System.in);
	System.out.println("digite o ano de seu nascimento");
	nasc=ler.nextInt();
	resto=nasc%4;
	if(resto==0) {
		System.out.println("Você nasceu num ano bissexto");
	}
	else {
		System.out.println("Você não nasceu num ano bissexto");
	}
	ler.close();
	}
}
