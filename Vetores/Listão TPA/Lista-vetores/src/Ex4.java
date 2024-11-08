import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args){
        Scanner ler = new Scanner (System.in);
        int a[],i,c;
        a = new int[10];
        //inserindo vetores
        for(i=0;i<10;i++){
            System.out.println("Digite o "+(i+1)+"° número");
            a[i]=ler.nextInt();
        }
        //relação dos pares
        for(i=0;i<10;i++){
            System.out.println((i+1)+"° Elemento : "+a[i]);
            System.out.print("Os números pares de 0 até "+a[i]+" são : ");
            
            //apresentando 
            for(c=0;c<=a[i];c++){
                                if(c % 2 == 0){
                    System.out.print(c+" ");
                   
                }
            }
            System.out.println("\n-------------------------------------------------------------------");    

        }
        ler.close();
    }
}