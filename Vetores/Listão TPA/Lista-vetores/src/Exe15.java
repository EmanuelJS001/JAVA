import java.util.*;
public class Exe15 {
    public static void main(String[] args){
        Scanner ler = new Scanner (System.in);
        //declaração de variaveis
        int i;
        Integer[] a = new Integer[10];
        Integer[] b = new Integer[10];
        Integer[] c = new Integer[10];
        
        //Leitura de dados 
        for(i=0;i<10;i++){
            System.out.println("Digite o "+(i+1)+"°valor de A");
            a[i]=ler.nextInt();
        }
        //preenchendo vetor B
            b = a.clone( );
            Arrays.sort(b);
        
        //preenchendo vetor C
            c = b.clone( );
            Arrays.sort(c,Collections.reverseOrder());
        
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