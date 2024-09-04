import java.util.Scanner;
public class Ex3 {
	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		double re, inss;
		
		System.out.println("Digite sua renda");
		re=ler .nextInt();
		if (re<1412) {
			inss=re*0.075;
			System.out.println("O inss será de "+inss+" R$");
		} else if (re<2666.68) {
			inss=re*0.09;
			System.out.println("O inss será de "+inss+" R$");			
		} else if (re<4000.03) {
			inss=re*0.12;
			System.out.println("O inss será de "+inss+" R$");	
		} else if (re<7786.02){
			inss=re*0.14;
			System.out.println("O inss será de "+inss+" R$");
		} else {
			inss=re*0.16;
			System.out.println("O inss será de "+inss+" R$");
		}
		
			ler.close(); 	
	} 
}
