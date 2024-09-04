import java.util.*;
public class ex4 {
	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		int cod;
		System.out.println("Digite o codigo do produto");
		cod=ler.nextInt();
		switch (cod) {
		case 1:
			System.out.println("Cachorro quente Valor:R$8,00");
			break;
		case 2:
			System.out.println("Cheeseburger Valor:R$12,00");
			break;
		case 3:
			System.out.println("X-salada Valor:R$15,00");
			break;
		case 4:
			System.out.println("Misto quente Valor:R$11,00");
			break;
		case 5:
			System.out.println("Pão na chapa Valor:R$6,00");
			break;
		default: 
			System.out.println("número invalido");
		}
		ler.close();
	}
}
