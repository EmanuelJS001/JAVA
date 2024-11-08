import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args){
Scanner ler = new Scanner (System.in);
        int a[],i,n=0,r,p;
        a = new int[5];
        
        for(i=0;i<5;i++){
            System.out.println("Digite o "+(i+1)+"° número");
            a[i]=ler.nextInt();
        }
        for(i=0;i<5;i++){
            System.out.println("tabuada do "+a[i]+" :");
            for(p=1;p<10;p++){
                r=a[n]*i;
                System.out.println(a[n]+"×"+i+"="+r);
            }
            n++;
        }
        ler.close();
    }
}