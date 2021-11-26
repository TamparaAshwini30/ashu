package module2;
import java.util.Scanner;


public class Emp {
	private int empId;
	private String empName;
	private double empSal;
	
	Scanner sc=new Scanner(System.in);
	
	
	public void accept() {
		System.out.println("enter the empId, name, salary");
		empId=sc.nextInt();
		empName=sc.next();
		empSal=sc.nextDouble();
		
		
	}
	public void display() {
		System.out.println("empid is " + empId);
		System.out.println("name is " + empName);
		System.out.println("salary is " + empSal);
		
	
	}

}
