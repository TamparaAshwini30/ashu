package module5;
import java.util.Scanner;
public class TestHDFC {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	HDFC hdfc=new HDFC();
	System.out.println(hdfc);
	// to change values using set method
	hdfc.setAccNumber(1);
	hdfc.setAccHolderName("priti");
	hdfc.setAccBalance(4000);
	System.out.println(hdfc);/// will call tostring()
	
	hdfc.setAccHolderName("preete");
	System.out.println(hdfc);
	
	System.out.println("===========");
	//get the data:mv
	System.out.println("the account number "+hdfc.getAccNumber());
	System.out.println("the name is "+hdfc.getAccHolderName());
	System.out.println("the balance is "+hdfc.getAccBalance());
	
	System.out.println("Calling the deposit method ");
	   
    System.out.println("enter the value to deposit");
    double amt=sc.nextDouble();
    hdfc.deposit(amt);
    System.out.println(hdfc);
   
    
    System.out.println("enter the value to withdraw");
    double amt2=sc.nextDouble();
    hdfc.withdraw(amt2);
    System.out.println(hdfc);
   
	

	}

}
