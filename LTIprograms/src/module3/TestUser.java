package module3;
import pack1.Emp;
public class TestUser {

	public static void main(String[] args) {
		Emp emp=new Emp();
		System.out.print("     ");
		System.out.println("calling the methods of Emp");
		emp.accept();
		emp.display();
		
		System.out.println(".......................");
		System.out.println("creating an object");
		
		User user=new User();
		user.accept();
		
		user.checkAge();
		user.checkSal();
		user.checkAll();
		user.display();

	}

}
