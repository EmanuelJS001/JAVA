import java.util.Scanner;
public class VetorMedia {
	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		//declarando vetores
		int i,a[], media=0, soma=0;
		a=new int[10];
		//calculando a média
		for(i=0;i<10;i++) {
			System.out.println("Digite o "+(i+1)+"° valor de A");
			a[i]=ler.nextInt();
			soma=soma+a[i];
			}
		media=soma/10;
		System.out.println("A média dos valores de A é: "+media);
		ler.close();
	}
}