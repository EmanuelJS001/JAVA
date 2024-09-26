import java.util.Scanner;
public class Economia {
    public static void main(String[] args){
        Scanner ler=new Scanner (System.in);
        int dis,tan,gm;
        
        System.out.println("Digite a distancia que o carro percorre com o tanque cheio em km");
        dis=ler.nextInt();
        System.out.println("Digite a capacidade do tanque");
        tan=ler.nextInt();
        gm=dis/tan;
        if (gm<10){
            System.out.println("O carro é economico");          
        } else {
            System.out.println("O carro não é economico");
        }
        ler.close();
    }
}