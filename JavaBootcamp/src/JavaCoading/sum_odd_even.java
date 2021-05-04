package JavaCoading;
import java.util.*;

public class sum_odd_even {
	 public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        long n=sc.nextLong();
	        long sum1=0;
	        long sum2=0;
	        while(n!=0){
	            long a=n%10;
	            n=n/10;
	            sum1=sum1+a;
	            long b=n%10;
	            n=n/10;
	            sum2=sum2+b;

	        }
	        System.out.println(sum1);
	        System.out.println(sum2);


	    }

}
