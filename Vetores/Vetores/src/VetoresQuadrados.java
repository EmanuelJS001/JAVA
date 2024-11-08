import java.util.*;
public class VetoresQuadrados {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int i,a[],b[];
		a = new int[10];
		b = new int[10];
		// Inserindo vetores
		for(i=0;i<10;i++) {
			System.out.println("Digite o "+(i+1)+"° valor");
			a[i]=ler.nextInt();
			b[i] = a[i]*a[i];
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
		System.out.print("[");
		for(i=0;i<10;i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println("]");
		
		ler.close();
	}

}
