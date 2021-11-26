package module3;

public class AndDemo {

	public static void main(String[] args) {
		int a=100;
		int b=200;
		int c=300;
		if(a>b && a>c)
			System.out.print(" a is greater than !!");
		if(b>a && b>c)
			System.out.print(" b is greater than !!");
		if(c>a && c>b)
			System.out.print(" c is greater than !!");
		
		//using or
		
	  if (b>a || b>c)
		  System.out.print(" either one condition is true");
	  if(a!=b)
		  System.out.print(" both are not accept");

	}

}
