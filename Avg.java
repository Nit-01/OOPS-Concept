//Average java
import java.util.*;
public class Avg {

    public static int averge(int a,int b,int c){
        int sum =a+b+c;
        int avg=sum/3;
        return avg;
    }
    public static void main(String []args){
        Scanner sn=new Scanner(System.in);

        int a=sn.nextInt();
        int b=sn.nextInt();
        int c=sn.nextInt();

        System.out.println("Average is :"+(averge(a,b,c)));


    }
    
}
