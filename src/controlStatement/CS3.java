package controlStatement;
import java.util.*;
public class CS3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        
        int price = sc.nextInt();
        
       if (price<=10000) {
			
			System.out.println("purchase samsung phone ");
		}
		else if (price>10000 & price <=30000) {
			
			System.out.println("Purchase one plus");
		}
		
		else if (price>30000 & price<=50000) {
			
			System.out.println("Purchase i phone");
		}
		else {
			
			System.out.println("Don't purchase phone");
		}
		
	}

}
