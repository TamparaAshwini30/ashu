package Inheritence;

public class Testperson {

	public static void main(String[] args) {
		Person person=new Person("krishna",'m',23);
		person.fun1();
		System.out.println(person);
		
		System.out.println("=============");
		
		System.out.println("creating an object of the class");
		
		Student arka=new Student("Arka",'m',22,10,'A',88,"electrical");
		System.out.println(arka);
System.out.println("==================");
System.out.println("creating  an object of emp class");
	}

}
