package JavaCoading;
import java.util.*;

public class simple_input {
	public static void main(String args[]) {
        long sum=0;
         Scanner sc=new Scanner(System.in);
        while(sum>=0){
           
            int n=sc.nextInt();
            sum=sum+n;
            if(sum>=0){
                System.out.println(n);
            }

        }

    }

}
