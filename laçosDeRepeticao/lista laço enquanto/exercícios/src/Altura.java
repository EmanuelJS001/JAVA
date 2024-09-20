public class Altura {
    public static void main(String[] args){
        int i = 0;
        double ap,aj;
        
        ap = 1.45;
        aj = 1.34;
        while(ap>=aj){
            ap+=0.02;
            aj+=0.025;
            i++;
        }
        System.out.println("ira demorar "+i+"anos para joão ficar mais alto que o pedro");
    }
}
