package module4;
import java.util.Scanner;
public class Account {
   private int accNo;
   private String accHolderName;
   private double balance;

     Scanner sc=new Scanner(System.in);

   public void accept()
   {
	System.out.println("enter the accno,name,balance");
	accNo=sc.nextInt();
	accHolderName=sc.next();
	balance=sc.nextDouble();
	
   }

@Override
public String toString() {
	return "Account [accNo=" + accNo + ", accHolderName=" + accHolderName + ", balance=" + balance + ", sc=" + sc + "]";
}
   
   
}
