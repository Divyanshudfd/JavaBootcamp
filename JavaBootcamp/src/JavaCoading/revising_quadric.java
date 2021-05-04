package JavaCoading;
import java.util.*;
import java.lang.Math;
public class revising_quadric {
	 public static void main(String args[]) {
	        Scanner sc=new Scanner(System.in);
	        int a=sc.nextInt();
	        int b=sc.nextInt();
	        int c=sc.nextInt();
	       
	 int d1=b*b - 4*a*c;
	        double e1=Math.sqrt(d1);
	        double result21=-b - e1;
	        int result2=(int)result21;
	        int result211=result2/2*a;
	        


	      
	        double result1=-b + e1;

	        int result=(int)result1;
	        int result11=result/2*a;
	        if(d1>0){
	             System.out.println("Real and Distinct");
	              System.out.print(result211+"  ");
	        System.out.print(result11);
	        }
	        else if(d1==0){
	             System.out.println("Real and Equal");
	              System.out.print(result211+"  ");
	        System.out.print(result11);
	        }
	        else{
	             System.out.println("Imaginary");
	        }
	       
	        

	    }
}
