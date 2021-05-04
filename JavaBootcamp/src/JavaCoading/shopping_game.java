package JavaCoading;
import java.util.*;

public class shopping_game {
	 public static void main(String args[]) {
	        Scanner sc=new Scanner(System.in);
	        int a=sc.nextInt();
	        for(int i=1;i<=a;i++){
	            long m=sc.nextLong();
	            long n=sc.nextLong();
	            for(int j=1;j<m && j<n;j++){
	                if(j%2!=0 && m>0){
	                    m=m-j;
	                }
	                else if(j%2==0 && n>0){
	                    n=n-j;
	                }
	               
	            }
	             if(m<n){
	                    System.out.println("Harshit");
	                }
	            else if(n<m){
	                  System.out.println("Aayush");
	                }

	        }

	    }

}
