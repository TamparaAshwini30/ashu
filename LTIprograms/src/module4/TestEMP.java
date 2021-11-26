package module4;

public class TestEMP {

	public static void main(String[] args) {
		  EMP emp1=new EMP();   //will call def  constructor
	        System.out.println(emp1);  //will call the toString()
	        
	        System.out.println("=================================");
	        System.out.println("Creating object with parameater");
	        EMP emp2=new EMP(1, "shiv", 60000); //will call the para constructor
	        System.out.println(emp2);  //will  all the toString()

	}

}
