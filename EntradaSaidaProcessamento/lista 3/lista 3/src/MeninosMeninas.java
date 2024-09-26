import java.util.Scanner;
public class MeninosMeninas {
	public static void main(String[] args) {
		float porcM, porcF, meninos, meninas, total; 
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o número de meninos na turma");
		meninos=ler.nextInt();
		System.out.println("Digite o número de meninas na turma");
		meninas=ler.nextInt();
		total=meninos+meninas;
		porcM=(meninos/total)*100;
		porcF=(meninas/total)*100;
		System.out.println("O total de alunos de "+total+" alunos");
		System.out.println("A porcentagem de meninos na turma é de "+porcM+"%");
		System.out.println("A porcentagem de meninas na turma é de "+porcF+"%");
		ler.close();
	}
}
