import java.util.Scanner;
public class Imc {
    public static void main(String[] args){
        Scanner ler = new Scanner (System.in);
        double a,p,imc;
        
        System.out.println("Digite a sua altura em metros");
        a=ler.nextDouble();
        System.out.println("Digite o eu peso em kilos");
        p=ler.nextDouble();
        imc=p/(a*a);
        if(imc<18.5) {
            System.out.println("O seu I.M.C é "+imc+" você está em estado de Excesso de Magreza");          
        } else if (imc<25) {
            System.out.println("O seu I.M.C é "+imc+" você está em estado de Peso Normal");
        } else if (imc<30) {
            System.out.println("O seu I.M.C é "+imc+" você está em estado de Excesso de Peso");
        } else if (imc<35) {
            System.out.println("O seu I.M.C é "+imc+" você está em estado de Obesidade(Grau 1)");
        } else if (imc<40) {
            System.out.println("O seu I.M.C é "+imc+" você está em estado de Obesidade(Grau 2)");
        } else {
            System.out.println("O seu I.M.C é "+imc+" você está em estado de Obesidade(Grau 3)");
        }
        ler.close();
    }
}