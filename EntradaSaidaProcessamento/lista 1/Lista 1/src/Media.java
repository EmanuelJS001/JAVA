import java.util.Scanner;
public class Media {
	public static void main(String[] args) {
		double n1, n2, r;
		Scanner ler=new Scanner(System.in);
		
		System.out.println("Digite a primeira nota do aluno");
		n1=ler.nextDouble();
		System.out.println("Digite a segunda nota do aluno");
		n2=ler.nextDouble();
		r=(n1+n2)/2;
		System.out.println("A média de notas do aluno é "+r);
		ler.close();
	}
}