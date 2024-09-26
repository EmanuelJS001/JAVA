import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner ler = new Scanner (System.in);
        int anoA,anoN,id;
        
        System.out.println("Digite o ano atual");
        anoA=ler.nextInt();
        System.out.println("Digite o seu ano de nascimento");
        anoN=ler.nextInt();
        id=anoA-anoN;
        if (id<10) {
            System.out.println("Você é uma criança, por que tem "+id+" anos");          
        } else if (id<18) {
            System.out.println("Você é um/a adolecente, por que tem "+id+" anos");
        } else if (id<60) {
            System.out.println("Você é um/a adulto/a, por que tem "+id+" anos");
        } else {
            System.out.println("Você é um/a idoso/a, por que tem "+id+" anos");
        }
        ler.close();
    }
}