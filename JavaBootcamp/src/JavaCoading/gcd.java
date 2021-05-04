package JavaCoading;
import java.util.*;
public class gcd {
	public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        long n1=sc.nextLong();
        long n2=sc.nextLong();
        long gcd=1;
        for(long i=1;i<=n1 && i<=n2;i++){
            if(n1%i==0 && n2%i==0){
                gcd=i;
            }
        }
        System.out.println(gcd);


    }
}
