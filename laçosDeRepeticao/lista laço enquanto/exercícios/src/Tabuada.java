public class Tabuada {
    public static void main(String[] args){
       int i=1,n=1,r;
        
        while(i<11){
            System.out.println("Tabuada do "+i);
            while(n<11){
                r =i*n;
                System.out.println(i+"×"+n+"="+r);
                n++;
            }
            i++;
            n=1;
        }
        
    }
}
