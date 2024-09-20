import java.util.Scanner;
public class Eleicao {
	public static void main(String[] args) {
	Scanner ler=new Scanner(System.in);
	
	int eleicao,nascimento,idade;
	System.out.println("Digite o ano da proxima eleição:");
	eleicao=ler.nextInt();
	System.out.println("Digite seu ano de nascimento:");
	nascimento=ler.nextInt();
	idade = eleicao-nascimento;
	
	if(idade<16) {
	System.out.println("Você não poderá votar nessa eleição");
	}
	else {
		System.out.println("Você poderá votar nessa eleição");
	}
	ler.close();
}
}
