import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        int inicio = 0, fim = 19;
        int[] a=new int[20]; 
        int[] b=new int[20];  
        
        //Inserindo vetores
        for (int i=0; i<20; i++) {
            System.out.println("Digite o "+(i+1)+"° valor:");
            a[i] = ler.nextInt();
        }
       
        //Separando par e impar
        for (int i=0; i<20; i++) {
            if (a[i]%2==0) {
                b[inicio]=a[i];
                inicio++;
            } else {
                b[fim]=a[i];
                fim--;
            }
        }
        // Apresentando o vetor A
        System.out.println("Vetor A com todos os elementos:");
        System.out.print("A = [");
        for (int i=0; i<20; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("]");
        
        // Apresentando o vetor B com pares e ímpares separados
        System.out.println("Vetor B com os elementos pares no inicio e impar no final:");
        System.out.print("B = [");
        for (int i=0; i<20; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println("]");
        ler.close();
    }
}
