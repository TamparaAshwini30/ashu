package module1;

public class Emp {
	private int empId;
	private double sal;

	public void accept() {
		System.out.println("this is accept method");
	}
	public void display() {
		System.out.println("this is display method");

	}
	public static void main(String args[])
	
	{
		Emp obj=new Emp();
		obj.accept();
		obj.display();
	}

}
