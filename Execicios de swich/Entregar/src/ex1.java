import java.util.Scanner;
public class ex1 {
	public static void main(String[] args) {
		int idade;
		Scanner ler=new Scanner(System.in);
		System.out.println("digite a sua idade");
		idade=ler.nextInt();
		switch (idade ) {
		case 6:
			System.out.println("dente de leite");
			break;
		case 7:
			System.out.println("Júnior");
			break;
		case 8:
			System.out.println("Júnior max");
			break;
		case 9:
			System.out.println("Júnior master");
			break;
		case 10:
			System.out.println("Master");
			break;
		default:
			System.out.println("A escola não alunos com essa idade");
		}
		ler.close();
	}
}
