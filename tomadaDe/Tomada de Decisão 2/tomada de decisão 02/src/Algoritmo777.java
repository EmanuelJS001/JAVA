import java.util.Scanner;
public class Algoritmo777 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String n1, n2, n3, n4, n5;
        int id1, id2, id3, id4, id5;
        
        System.out.print("Digite o nome do primeiro usuário: ");
        n1=ler.next();
        System.out.print("Digite o nome do segundo usuário");
        n2=ler.next();
        System.out.print("Digite o nome do terceiro usuário");
        n3=ler.next();
        System.out.print("Digite o nome do quarto usuário");()
        n4=ler.next();
        System.out.print("Digite o nome do quinto usuário");
        n5=ler.next();
        
        System.out.print("Digite a idade do primeiro usuário");
        id1=ler.nextInt();
        System.out.print("Digite a idade do segundo usuário");
        id2=ler.nextInt();
        System.out.print("Digite a idade do terceiro usuário");
        id3=ler.nextInt();
        System.out.print("Digite a idade do quarto usuário");
        id4=ler.nextInt();
        System.out.print("Digite a idade do quinto usuário");
        id5=ler.nextInt();

        if (id1 > id2 && id1 > id3 && id1 > id4 && id1 > id5) {
            if (id2 <= id3 && id2 <= id4 && id2 <= id5) {
                System.out.println("O mais velho é " + n1 + " com " + id1 + " anos e o mais novo é " + n2 + " com " + id2 + " anos.");
            } else if (id3 <= id2 && id3 <= id4 && id3 <= id5) {
                System.out.println("O mais velho é " + n1 + " com " + id1 + " anos e o mais novo é " + n3 + " com " + id3 + " anos.");
            } else if (id4 <= id3 && id4 <= id2 && id4 <= id5) {
                System.out.println("O mais velho é " + n1 + " com " + id1 + " anos e o mais novo é " + n4 + " com " + id4 + " anos.");
            } else if (id5 <= id3 && id5 <= id4 && id5 <= id2) {
                System.out.println("O mais velho é " + n1 + " com " + id1 + " anos e o mais novo é " + n5 + " com " + id5 + " anos.");
            }
        } else if (id2 > id1 && id2 > id3 && id2 > id4 && id2 > id5) {
            if (id1 <= id3 && id1 <= id4 && id1 <= id5) {
                System.out.println("O mais velho é " + n2 + " com " + id2 + " anos e o mais novo é " + n1 + " com " + id1 + " anos.");
            } else if (id3 <= id1 && id3 <= id4 && id3 <= id5) {
                System.out.println("O mais velho é " + n2 + " com " + id2 + " anos e o mais novo é " + n3 + " com " + id3 + " anos.");
            } else if (id4 <= id3 && id4 <= id1 && id4 <= id5) {
                System.out.println("O mais velho é " + n2 + " com " + id2 + " anos e o mais novo é " + n4 + " com " + id4 + " anos.");
            } else if (id5 <= id3 && id5 <= id4 && id5 <= id1) {
                System.out.println("O mais velho é " + n2 + " com " + id2 + " anos e o mais novo é " + n5 + " com " + id5 + " anos.");
            }
        } else if (id3 > id2 && id3 > id1 && id3 > id4 && id3 > id5) {
            if (id2 <= id1 && id2 <= id4 && id2 <= id5) {
                System.out.println("O mais velho é " + n3 + " com " + id3 + " anos e o mais novo é " + n2 + " com " + id2 + " anos.");
            } else if (id1 <= id2 && id1 <= id4 && id1 <= id5) {
                System.out.println("O mais velho é " + n3 + " com " + id3 + " anos e o mais novo é " + n1 + " com " + id1 + " anos.");
            } else if (id4 <= id1 && id4 <= id2 && id4 <= id5) {
                System.out.println("O mais velho é " + n3 + " com " + id3 + " anos e o mais novo é " + n4 + " com " + id4 + " anos.");
            } else if (id5 <= id1 && id5 <= id4 && id5 <= id2) {
                System.out.println("O mais velho é " + n3 + " com " + id3 + " anos e o mais novo é " + n5 + " com " + id5 + " anos.");
            }
        } else if (id4 > id2 && id4 > id3 && id4 > id1 && id4 > id5) {
        	if (id2 <= id3 && id2 <= id1 && id2 <= id5) {
                System.out.println("O mais velho é " + n4 + " com " + id4 + " anos e o mais novo é " + n2 + " com " + id2 + " anos.");
            } else if (id3 <= id1 && id3 <= id2 && id3 <= id5) {
                System.out.println("O mais velho é " + n4 + " com " + id4 + " anos e o mais novo é " + n3 + " com " + id3 + " anos.");
            } else if (id1 <= id3 && id1 <= id2 && id1 <= id5) {
                System.out.println("O mais velho é " + n4 + " com " + id4 + " anos e o mais novo é " + n1 + " com " + id1 + " anos.");
            } else if (id5 <= id3 && id5 <= id1 && id5 <= id2) {
                System.out.println("O mais velho é " + n4 + " com " + id4 + " anos e o mais novo é " + n5 + " com " + id5 + " anos.");
            }
        } else if (id5 > id2 && id5 > id3 && id5 > id4 && id5 > id1) {
            if (id2 <= id3 && id2 <= id4 && id2 <= id1) {
                System.out.println("O mais velho é " + n5 + " com " + id5 + " anos e o mais novo é " + n2 + " com " + id2 + " anos.");
            } else if (id3 <= id1 && id3 <= id4 && id3 <= id2) {
                System.out.println("O mais velho é " + n5 + " com " + id5 + " anos e o mais novo é " + n3 + " com " + id3 + " anos.");
            } else if (id4 <= id3 && id4 <= id1 && id4 <= id2) {
                System.out.println("O mais velho é " + n5 + " com " + id5 + " anos e o mais novo é " + n4 + " com " + id4 + " anos.");
            } else if (id1 <= id3 && id1 <= id4 && id1 <= id2) {
                System.out.println("O mais velho é " + n5 + " com " + id5 + " anos e o mais novo é " + n1 + " com " + id1 + " anos.");
            }
        }

        ler.close();
    }
}