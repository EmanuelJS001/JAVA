import java.util.Scanner;
public class idade {
public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	int i,anoAtual,anoNasc,velho=0,novo=0,idade;
	System.out.println("Digite o ano atual ");
		anoAtual =ler.nextInt();
		
	for(i=1;i<=10;i++) {
		System.out.println("Digite o ano de nascimento do usuario ");
		anoNasc =ler.nextInt();
		idade = anoAtual-anoNasc;
		if(novo==0) {
			novo = idade;
		}
		if(idade<novo) {
			novo = idade;
		}
		if(idade>velho) {
			velho = idade;	
		}
		System.out.println("A idade desse usuário é "+idade+" anos");
	}
	System.out.println("A idade do usuário mais velho é "+velho);
	System.out.println("A idade do usuário mais novo é "+novo);
	ler.close();
}
}
