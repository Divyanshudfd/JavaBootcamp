package JavaCoading;
import java.util.*;
public class Fabonicii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       
        int a1=0;
        int a2=1;
        int fab=0;
        for(int i=2;i<=n;i++){
            fab=a1+a2;
            a1=a2;
            a2=fab;

        }
        System.out.println(fab);

	}

}
