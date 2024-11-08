import java.util.Scanner;
public class Exe11 {
    public static void main(String[] args){
        Scanner ler = new Scanner (System.in);
        int a[], i, x=0;
        boolean d=false;
        a = new int[10];
        
        for(i=0;i<10;i++){
            System.out.println("Digite o "+(i+1)+"° valor de A");
            a[i]=ler.nextInt();
        }
        System.out.println("Digite o número que deseja buscar no vetor A");
        x=ler.nextInt();
        for (i=0;i<10;i++) {
        	if (x==a[i]) {
        		d=true;
        	} 
        } if (d==true) {
    		System.out.println("Esse número foi encontrado no vetor A");
    	} else {
    		System.out.println("Esse número não foi encontrado no Vetor A");
    	}
        ler.close();
    }
}