import java.util.Scanner;
public class Algoritmo8 {
	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
	double n1,n2,n3,media,media2 = 0;
	
	System.out.println("Digite a primeira nota");
	n1=ler.nextDouble();
	System.out.println("Digite a segunda nota");
	n2=ler.nextDouble();
	media=(n1+n2)/2;
	if(media<3) {
		System.out.println("o aluno esta REPROVADO");
	} else if (media<6) {
		System.out.println("o aluno esta em EXAME");
		System.out.println("digite a nova nota do aluno");
		n3=ler.nextDouble();
		media2=(media+n3)/2;
	} if (media2>=6) {
		System.out.println("o aluno esta APROVADO");
	} else {
		System.out.println("o aluno esta REPROVADO");
	}
	ler.close();
	}
}