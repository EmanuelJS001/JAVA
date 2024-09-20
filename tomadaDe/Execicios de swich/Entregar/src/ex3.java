import java.util.Scanner;
public class ex3 {
	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		String nota;
		int mb, b, r, i, total;
		double porc;
		System.out.println("quantos alunos tiraram MB?");
		mb=ler.nextInt();
		System.out.println("quantos alunos tiraram B?");
		b=ler.nextInt();
		System.out.println("quantos alunos tirarm R?");
		r=ler.nextInt();
		System.out.println("quantos alunos tiraram I");
		i=ler.nextInt();
		total=mb+b+r+i;
		System.out.println("escreva a nota");
		nota=ler.next();
		switch (nota) {
		case "MB":
			porc=((double)mb/total)*100;
			System.out.println("a porcentagem de alunos que tiraram MB foi "+ porc+" e o total de alunos é "+ total);
			break;
		case "B":
			porc=((double)b/total)*100;
			System.out.println("a porcentagem de alunos que tiraram B foi "+ porc+" e o total de alunos é "+ total);
			break;
		case "R":
			porc=((double)r/total)*100;
			System.out.println("a porcentagem de alunos que tiraram R foi "+ porc+" e o total de alunos é "+ total);
			break;
		case "I":
			porc=((double)i/total)*100;
			System.out.println("a porcentagem de alunos que tiraram I foi "+ porc+" e o total de alunos é "+ total);
			break;
		default:
			System.out.println("essa nota não existe");
		}
	ler.close();		
}
}
