import java.util.Scanner;
public class Primo {
    public static void main(String[] args){
        Scanner ler = new Scanner (System.in);
        int i = 1,n,divisores = 0;
        System.out.println("Digite um número pra saber se ele é um numero primo");
        n = ler.nextInt();
        while(i<=n){
            if(n % i == 0){
                divisores++;
            }
            i++;
        }
        if(divisores == 2) {
            System.out.println("O numero "+n+" é primo");
        }
        else{
            System.out.println("O numero "+n+" não é primo");
        }
        ler.close();
    }
}
