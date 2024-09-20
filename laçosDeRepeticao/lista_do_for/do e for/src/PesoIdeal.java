import java.util.Scanner;
public class PesoIdeal {
	public static void main(String[] args) {
		Scanner l=new Scanner(System.in);
		String sex, resp;
		double alt, pesId;
		
		do {
		System.out.println("digite M para sexo masculino ou F para feminino");
		sex=l.next();
		System.out.println("digite o sua altura");
		alt=l.nextDouble();
		if (sex.equalsIgnoreCase ("M")) {
			pesId=52+(0.75*(alt-152.4));
			System.out.println("Seu peso ideal é de "+pesId+" KG");
		}
		if (sex.equalsIgnoreCase ("F")) {
			pesId=52+(0.67*(alt-152.4));
			System.out.println("Seu peso ideal é de "+pesId+" KG");
		}
		
		System.out.println("Caso deseje digite S para continuar ou N para finalizar");
		resp=l.next();
		} while(resp.equalsIgnoreCase ("S"));
		l.close();
	}
}
