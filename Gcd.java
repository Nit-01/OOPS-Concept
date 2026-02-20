import java.util.*;

public class Gcd {

    public static void gcd(int a,int b){
        int min=(Math.min(a,b));
        int g=1;

        for(int i=2;i<=min;i++){
            if(a%i==0 && b%i==0){
                g=i;

            }
        }
        System.out.println(g);

    }
    public static void main(String args[]){
        Scanner sn=new Scanner(System.in);

        int a=sn.nextInt();
        int b=sn.nextInt();
        gcd(a,b);
    }
}
