import java.util.Scanner;
public class Area {
    public static void main(String[] args){
        Scanner ler = new Scanner (System.in);
        double base,altu,area;
        
        System.out.println("Digite a base do triangulo retanglo");
        base=ler.nextDouble();
        System.out.println("Digite a altura do trianguo retangulo");
        altu=ler.nextDouble();
        area=(base*altu)/2;
        System.out.println("a area do triangulo retangulo é "+area);
        ler.close();
    }
}