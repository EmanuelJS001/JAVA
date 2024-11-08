import java.util.Scanner;
public class Ex8 {
    public static void main(String[] args){
        Scanner ler = new Scanner (System.in);
        int a[],b[],i,j,soma;
        a = new int[10];
        b = new int[10];
        
        //inserindo vetores
        for(i=0;i<10;i++){
            System.out.println("Digite o "+(i+1)+"° número");
            a[i]=ler.nextInt();
        }
        //somatório
        for(i=0;i<10;i++){
            soma = 0;
            for(j=i;j<10;j++){
                soma +=a[j];
            }
            b[i]=soma;
        }
        System.out.print("A=[");
        for(i=0;i<10;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("]");
        System.out.print("\nB=[");
        for(i=0;i<10;i++){
            System.out.print(b[i]+" ");
        }
        System.out.println("]");
        ler.close();
    }
}