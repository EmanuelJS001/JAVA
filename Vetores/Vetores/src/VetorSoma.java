import java.util.Scanner;
public class VetorSoma {
	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		//declarando vetores
		int i,a[],b[],c[];
		a=new int[10];
		b=new int[10];
		c=new int[10];
		//Lendo A 
		for(i=0;i<10;i++) {
			System.out.println("Digite o "+(i+1)+"° valor de A");
			a[i]=ler.nextInt();
			} 
		for(i=0;i<10;i++) {
			System.out.println("Digite o "+(i+1)+"° valor de B");
			b[i]=ler.nextInt();
			c[i]=a[i]+b[i];
			}
		System.out.print("C = [");
		for (i=0;i<10;i++) {
			System.out.print(c[i]+" ");
		}
		System.out.print("]");
			
		
		
		
		
	ler.close();
	}
}
