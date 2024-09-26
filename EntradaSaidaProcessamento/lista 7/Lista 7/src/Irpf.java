import java.util.Scanner;
public class Irpf {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        double sal, irpf;

        System.out.println("Digite o valor do seu salário:");
        sal = ler.nextDouble();
        if (sal <= 1434.60) {
            System.out.println("Isento");
        } else if (sal <= 2150.01) {
            irpf = (sal * 7.5) / 100 - 107.59;
            System.out.println("O desconto do IRPF é de R$ " + irpf);
        } else if (sal <= 2866.71) {
            irpf = (sal * 15) / 100 - 268.84;
            System.out.println("O desconto do IRPF é de R$ " + irpf);
        } else if (sal <= 3582.01) {
            irpf = (sal * 22.5) / 100 - 483.84;
            System.out.println("O desconto do IRPF é de R$ " + irpf);
        } else {
            irpf = (sal * 27.5) / 100 - 662.94;
            System.out.println("O desconto do IRPF é de R$ " + irpf);
        }
        ler.close();
    }
}