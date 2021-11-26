package module6;

public class BankAccount {
	private int accNo;
	private double bal;
	private static int idNum=1;
	
	public BankAccount()
	{
		bal=0.0;
		accNo=idNum++;
	}
	public static int getIdNum()
	{
		return idNum;
	}

	public static void main(String[] args) {
		BankAccount obj=new BankAccount();
		System.out.println(obj.getIdNum());
		BankAccount obj2=new BankAccount();
		System.out.println(obj2.getIdNum());
		BankAccount obj3=new BankAccount();
		System.out.println(obj3.getIdNum());
	}

}
