import java.util.Scanner;
public class Exe12 {
    public static void main(String[] args){
        Scanner ler = new Scanner (System.in);
        int a[],i;
        a = new int[10];
        
        for(i=0;i<10;i++){
            System.out.println("Digite o "+(i+1)+"°valor de A");
            a[i]=ler.nextInt();
        }
        if(a[0]==a[9] && a[1]==a[8] && a[2]==a[7] && a[3]==a[6] && a[4]==a[5]){
            System.out.println("Esse vertor forma um número políndromo");
        }else{
            System.out.println("Esse vertor não um forma número políndromo");
        }
        
        ler.close();
    }
}