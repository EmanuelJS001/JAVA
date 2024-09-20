import java.util.Scanner;
public class Potencia {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int b,e,p,i=1;
        
        System.out.println("digite a base");
        b =ler.nextInt();
        System.out.println("digite o expoente");
        e =ler.nextInt();
        p = b;
        while(i<e){
            p = b*p;
            i++;
        }
        System.out.println("A potência da base "+b+" com o expoente "+e+" é "+p);
        ler.close();
    }
}
