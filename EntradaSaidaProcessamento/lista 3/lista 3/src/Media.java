import java.util.Scanner;
public class Media {
	public static void main(String[] args) {
		float  n1, n2, n3, media;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite a 1º nota");
		n1=ler.nextFloat();
		System.out.println("Digite a 2º nota");
		n2=ler.nextFloat();
		System.out.println("Digite a 3º nota");
		n3=ler.nextFloat();
		media=(n1+n2+n3)/3;
		System.out.println("A média das notas inseridas é de "+media);
		ler.close();
	}
}
