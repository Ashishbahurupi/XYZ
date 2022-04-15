package Oops;

public class BankApplication extends Abstraction{
	
	

	@Override
	public void fullname() {
		
	System.out.println(" ashish bahurupi");	
	}

	@Override
	public void mobileno() {
	
		System.out.println("9503888983 ");
	}

	@Override
	public void emailid() {
	
		System.out.println(" ashubahurupi@gmail.com");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	BankApplication bank=new BankApplication();
	
       bank.Creditcard();
       bank.emailid();
       bank.fullname();
       bank.mobileno();
       
       bank.lastmasg();
       bank.lastmasg();
	}
}
