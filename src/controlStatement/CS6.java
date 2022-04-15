package controlStatement;
import java.util.*;
public class CS6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		
		int x=sc.nextInt();

	       switch (x) {
	       
	       case 1: System.out.println("Case 1 ");
	              break;
	       
	       case 2: System.out.println("case 2");
	             break;
	       case 3: System.out.println("case 3");
	               break;
	       default : System.out.println("No match");
	      
		}
	       
	       String s="jan";
	       
	       switch (s) {
	       
	       case "jan" : System.out.println(1);
	       break;
	                   
	       case "feb" : System.out.println(2);
	       }
	}

}
