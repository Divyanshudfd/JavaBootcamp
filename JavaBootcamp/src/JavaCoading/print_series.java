package JavaCoading;
import java.util.*;
public class print_series {
	 public static void main(String args[]) {
	        Scanner sc=new Scanner(System.in);
	        int n1=sc.nextInt();
	        int n2=sc.nextInt();
	        int i=1;
	        int a=1;
	        while(n1!=0){
	             a=3*i+2;
	            if(a%n2!=0){
	                 System.out.println(a);
	                
	                 n1--;
	            }
	             i++;
	        }
	        }


}
