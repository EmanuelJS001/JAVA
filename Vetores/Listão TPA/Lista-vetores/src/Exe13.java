import java.util.Scanner;
public class Exe13 {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        int i;
        int[] a=new int[10]; 
        int[] b=new int[10];  
        
        //Inserindo vetores
        for (i=0; i<10; i++) {
            System.out.println("Digite o "+(i+1)+"° valor:");
            a[i] = ler.nextInt();
        }
        //Separando par e impar
        for (i=0; i<10; i++) {
            if (a[i]%2==0) {
                b[i]=1;
            } else {
            	b[i]=0;
            }
        }
        // Apresentando o vetor A
        System.out.println("Vetor A com todos os elementos:");
        System.out.print("A = [");
        for (i=0; i<10; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("]");
        
        // Apresentando o vetor B com pares e ímpares separados
        System.out.println("Vetor B com 1 e 0");
        System.out.print("B = [");
        for (i=0; i<10; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println("]");
        ler.close();
    }
}