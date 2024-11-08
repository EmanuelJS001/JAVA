import java.util.Scanner;
public class Ex7 {
    public static void main(String[] args){
        Scanner ler = new Scanner (System.in);
        //declarando variaveis
        float a[],b[];
        int i,c;
        a = new float[15];
        b = new float[15];

        //Leitura de dados 
        for(i=0;i<15;i++){
            System.out.println("Digite o "+(i+1)+"° valor de A");
            a[i]=ler.nextInt();
        }
        //preenchendo vetor B
        for(i=0;i<15;i++){
            b[i]=0;
            for(c=1;c<=a[i];c++){
                b[i]=b[i]+c;
            }
        }
        // apresentando vetores
        System.out.print("A=[");
        for(i=0;i<15;i++){
            System.out.print(a[i]+" ");
        }
        System.out.print("]");
        System.out.print("\nB=[");
        for(i=0;i<15;i++){
            System.out.print(b[i]+" ");
        }
        System.out.print("]");
        ler.close();
    }
}