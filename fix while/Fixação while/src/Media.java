import java.util.*;
public class Media {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
        double i=0,ini,fin,res=0,ele=0;
       
        System.out.println("digite o numero inicial");
        ini=ler.nextDouble();
        System.out.println("digite o numeo final");
        fin=ler.nextDouble();
        i=ini;
        while (i<=fin) {
        	res=i+res;
        	i++;
        	ele++;
        }
        res=res/ele;
        System.out.println(res);
        
    ler.close();
	}
}