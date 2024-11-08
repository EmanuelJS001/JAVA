import java.util.Scanner;
public class Ex7 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a[], i, d;
        
        a = new int[10];
        // Inserindo valores no vetor
        for (i = 0; i < 10; i++) {
            System.out.println("Digite o " + (i + 1) + "° valor:");
            a[i] = ler.nextInt();
        }
        // achando e imprimindo os divisores dos elementos
        for (i = 0; i < 10; i++) {
            System.out.println("Elemento: " + a[i]);
            System.out.print("Divisores: ");
            for (d = 1; d <= a[i]; d++) {
                if (a[i] % d == 0) {
                    System.out.print(d + " ");
                }
            }
            System.out.println();
        }
        ler.close();
    }
}
