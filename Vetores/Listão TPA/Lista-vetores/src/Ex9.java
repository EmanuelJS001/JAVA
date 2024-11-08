import java.util.Scanner;
public class Ex9 {
    public static void main(String[] args){
        Scanner ler = new Scanner (System.in);
        int a[],b[],c[],i,d=0, e;
        a = new int[10];
        b = new int[10];
        c = new int[10];
        
        for(i=0;i<10;i++){
            System.out.println("Digite o "+(i+1)+"° valor de A");
            a[i]=ler.nextInt();
        }
        for(i=0;i<10;i++){
            System.out.println("Digite o "+(i+1)+"° valor de B");
            b[i]=ler.nextInt();
        }
        
        for(i=0;i<10;i++){
            for(e=0; e<10; e++) {
            	if (a[i]==b[e]) {
            		c[d]=a[i];
            		d++;
            	break;
            	}
            }
        }
        System.out.print("A=[");
        for(i=0;i<10;i++){
            System.out.print(a[i]+" ");
        }
        System.out.print("]");
        System.out.print("\nB=[");
        for(i=0;i<10;i++){
            System.out.print(b[i]+" ");
        }
        System.out.print("]");
        System.out.println("\n Os elementos intercalados são");
        System.out.print("C=[");
        for (i = 0; i < d; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println("]");
        ler.close();
    }
}