import java.util.Scanner;
public class VetorInvertido {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
			int i,a[],b[],ib=9;
			a = new int[10];
			b = new int[10];
			
			// Inserindo vetores e invertendo valores
			for(i=0;i<10;i++) {
				System.out.println("Digite o "+(i+1)+"° valor");
				a[i]=ler.nextInt();
				b[ib]=a[i];
				ib--;
				}
			//Apresentando os valores do vetor a
			System.out.println("Os valores inseridos no vetor A são :");
			System.out.print("A = [");
			for(i=0;i<10;i++) {
				System.out.print(a[i]+" ");
			}
			System.out.println("]");
			//Apresentando os valores do vetor b
			System.out.println("Os valores do vetor A ao quadrado são :");
			System.out.print("B = [");
			for(i=0;i<10;i++) {
				System.out.print(b[i]+" ");
			}
			System.out.println("]");
		
		
			ler.close();
	}
}
