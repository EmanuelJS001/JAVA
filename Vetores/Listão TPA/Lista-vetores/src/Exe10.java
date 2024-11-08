import java.util.Scanner;
public class Exe10 {
    public static void main(String[] args){
        Scanner ler = new Scanner (System.in);
        int a[],b[],c[],i,d=0;
        a = new int[10];
        b = new int[10];
        c = new int[10];
        
        for(i=0;i<10;i++){
            System.out.println("Digite o "+(i+1)+"°valor de A");
            a[i]=ler.nextInt();
        }
        for(i=0;i<10;i++){
            System.out.println("Digite o "+(i+1)+"° valor de B");
            b[i]=ler.nextInt();
        }
        
        for(i=0;i<10;i++){
            if(a[i]!=b[0] && a[i]!=b[1] && a[i]!=b[2] && a[i]!=b[3] && a[i]!=b[4] && a[i]!=b[5] && a[i]!=b[6] && a[i]!=b[7] && a[i]!=b[8] && a[i]!=b[9]){
                c[d]=a[i];
                d++;
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
        System.out.println("\n As diferenças entre esses vetores são:");
        System.out.print("C=[");
        for(i=1;i<=d;i++){
            System.out.print(c[i-1]+" ");
        }
        System.out.print("]");
        
        ler.close();
    }
}