package JavaCoading;
import java.util.*;

public class replace_Them_All {
	
	

	
	    public static void main(String args[]) {
	        Scanner sc= new Scanner(System.in);
	        long num =sc.nextLong();
	       long  reversed = 0;
	       
	       long rev=0;


	   
	    while(num!=0) {
	    
	      long digi = num % 10;
	      if(digi==0){
	          digi=5;
	           rev = rev * 10 + digi;
	      }
	      else{
	           rev = rev * 10 + digi;
	      }
	    
	      num /= 10;
	    }   
	     while(rev != 0) {
	    
	      long digit = rev % 10;
	      reversed = reversed * 10 + digit;
	      rev /= 10;
	    }
	if(reversed ==0){
	System.out.print("5");
	}
	else{
	System.out.print(reversed);
	}

	    }
	

}
