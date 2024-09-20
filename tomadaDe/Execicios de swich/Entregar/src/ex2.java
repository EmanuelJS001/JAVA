import java.util.Scanner;
public class ex2 {
	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		int dia, mes;
		System.out.println("digite o mês em que voçê nasceu");
		mes=ler.nextInt();
		System.out.println("digite o dia em que voçê nasceu");
		dia=ler.nextInt();
		switch (mes) {
		case 1:
			if (dia<=21) {
				System.out.println("Seu signo é de aquário");	
			} else {
				System.out.println("Seu signo é de capricórnio");
			} break;
		case 2:
			if (dia<=20) {
				System.out.println("Seu signo é de peixes");	
			} else {
				System.out.println("Seu signo é de aquário");
			} break;
		case 3:
			if (dia<=20) {
				System.out.println("Seu signo é de áries");	
			} else {
				System.out.println("Seu signo é de peixes");
			} break;
		case 4:
			if (dia<=21) {
				System.out.println("Seu signo é de touro");	
			} else {
				System.out.println("Seu signo é de áries");
			} break;
		case 5:
			if (dia<=21) {
				System.out.println("Seu signo é de gêmeos");	
			} else {
				System.out.println("Seu signo é de touro");
			} break;
		case 6:
			if (dia<=21) {
				System.out.println("Seu signo é de cânçer");	
			} else {
				System.out.println("Seu signo é de gêmeos");
			} break;
		case 7:
			if (dia<=22) {
				System.out.println("Seu signo é de leão");	
			} else {
				System.out.println("Seu signo é de câncer");
			} break;
		case 8:
			if (dia<=23) {
				System.out.println("Seu signo é de virgem");	
			} else {
				System.out.println("Seu signo é de leão");
			} break;
		case 9:
			if (dia<=23) {
				System.out.println("Seu signo é de libra");	
			} else {
				System.out.println("Seu signo é de virgem");
			} break;
		case 10:
			if (dia<=23) {
				System.out.println("Seu signo é de escorpião");	
			} else {
				System.out.println("Seu signo é de libra");
			} break;
		case 11:
			if (dia<=22) {
				System.out.println("Seu signo é de sagitário");	
			} else {
				System.out.println("Seu signo é de escorpião");
			} break;
		case 12:
			if (dia<=22) {
				System.out.println("Seu signo é de capricornio");	
			} else {
				System.out.println("Seu signo é de sagitário");
			} break;
		default:
			System.out.println("mês inexistente");
		}
		ler.close();
	}
}
