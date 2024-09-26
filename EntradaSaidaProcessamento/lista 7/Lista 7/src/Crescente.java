import java.util.Scanner;
public class Crescente {
	public static void main(String[] args) {
		int a, b, c;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o 1º número");
		a=ler.nextInt();
		System.out.println("Digite o 2º número");
		b=ler.nextInt();
		System.out.println("Digite o 3º número");
		c=ler.nextInt();
		if (a <= b && b <= c) {
            System.out.println(a+", "+b+", "+c);
        } else if (a <= c && c <= b) {
            System.out.println(a+", "+c+", "+b);
        } else if (b <= a && a <= c) {
            System.out.println(b+", "+a+", "+c);
        } else if (b <= c && c <= a) {
            System.out.println(b+", "+c+", "+a);
        } else if (c <= a && a <= b) {
            System.out.println(c+", "+a+", "+b);
        } else {
            System.out.println(c+", "+b+", "+a);	
		}
		ler.close();
	}
}