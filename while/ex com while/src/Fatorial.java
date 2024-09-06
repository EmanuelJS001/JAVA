import java.util.Scanner;
public class Fatorial {
    public static void main(String[] args){
        Scanner ler = new Scanner (System.in);
        
        int i,n,fat;
        System.out.println("Digite um numero para descobrir seu fatorial");
        n =ler.nextInt();
        i = n-1;
        fat = n;
        
        while(i>0){
            fat = fat*i;
            i--;
        }
        
        System.out.println("O fatorial do numero "+n+" é "+fat);
        ler.close();
    }
}


