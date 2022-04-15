package controlStatement;
import java.util.*;
public class CS5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of x");
		int x=sc.nextInt();
		System.out.println("Enter value of y");
		int y=sc.nextInt();
		System.out.println("Enter value of z");
		int z=sc.nextInt();
		
		
		if(x>y) {
			
			if (x>z) {
				
				System.out.println("x is greater than y & z");
			}
			else {
			 if(z>y) {
				System.out.println("Z is greater than x & y");
			}
			}
		} else {
		if (y>z)
			System.out.println("Y is greater than x & z");
		else 
			System.out.println("z is largest");
		}
		
	}

}
