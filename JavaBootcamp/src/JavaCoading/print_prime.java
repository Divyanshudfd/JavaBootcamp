package JavaCoading;
import java.util.*;

public class print_prime {
	public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean flag =true;
          for(int i=2;i<=n;i++){
              if(isprime(i)){
                  System.out.println(i);
              }
          }
    }
      public static boolean isprime(int n){
          if(n<=1){
              return false;
          }
           for (int i = 2; i <= Math.sqrt(n); i++) {  
           if (n % i == 0) {  
               return false;  
           }  
       }  
       return true; 

      }
}
