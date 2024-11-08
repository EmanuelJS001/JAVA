import java.util.Scanner;
public class Exe14 {
    public static void main(String[] args){
        Scanner ler = new Scanner (System.in);
        //declaração de variaveis
        int a[],b[],c[],i;
        a = new int[10];
        b = new int[10];
        c = new int[10];
        //Leitura de dados 
        for(i=0;i<10;i++){
            System.out.println("Digite o "+(i+1)+"°valor de A");
            a[i]=ler.nextInt();
        }
        for(i=0;i<10;i++){
            System.out.println("Digite o "+(i+1)+"°valor de B");
            b[i]=ler.nextInt();
        }
        //preenchendo vetor C
        for(i=0;i<10;i++){
            if(a[i]>b[i]){
                c[i]=1;
            }else if(a[i]==b[i]){
                c[i]=0;
            }else{
                c[i]=-1;
            }
        }
        // apresentando vetores
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
        System.out.print("\nC=[");
        for(i=0;i<10;i++){
            System.out.print(c[i]+" ");
        }
        System.out.print("]");
        
        ler.close();
    }
}
