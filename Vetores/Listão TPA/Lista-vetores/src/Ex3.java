import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args){
Scanner ler = new Scanner (System.in);
        int a[],i,n=0,c;
        a = new int[10];
        
        for(i=0;i<10;i++){
            System.out.println("Digite o "+(i+1)+"° número");
            a[i]=ler.nextInt();
        }
        for(i=0;i<10;i++){
            for(c=1;c<=a[i];c++){
                if(a[i]%c==0){
                    n++;
                }
            }
            if(n==2){
                System.out.println("O "+(i+1)+"° número do vertor A é : "+a[i]+", ele é PRIMO");
            }
            if(n!=2 && a[i]!=1){
                System.out.println("O "+(i+1)+"° número do vertor A é : "+a[i]+", ele NÃO é Primo");
            }
            if(a[i]==1){
                System.out.println("O "+(i+1)+"° número do vertor A é : "+a[i]+", ele é PRIMO");
            }
            n=0;
        }
        
        
        ler.close();
    }
}