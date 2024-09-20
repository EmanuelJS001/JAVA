import java.util.Scanner;
public class Salario {
	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		
		double salLiquido,inss,salBruto;
		System.out.println("Digite o seu sálario bruto");
		salBruto=ler.nextDouble();
		
		if(salBruto>2500){
			inss= (salBruto/100)*11;	
			salLiquido= salBruto-inss;
			System.out.println("O valor pago ao INSS devera ser: " + inss + "E o seu sálario liquido sera :" + salLiquido);
		}
		else {
			inss= (salBruto/100)*9;	
			salLiquido= salBruto-inss;
			System.out.println("O valor pago ao INSS devera ser: " + inss + "E o seu sálario liquido sera :" + salLiquido);	
		}
	}
}
