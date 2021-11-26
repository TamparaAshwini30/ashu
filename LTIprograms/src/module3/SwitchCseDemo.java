package module3;
import java.util.Scanner;

public class SwitchCseDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a number");
		int a=sc.nextInt();
		
		switch(a)
		{
		case 1:
			System.out.println("it is monday today");
		    break;	
		case 2:
			System.out.println("it is tuesday");
		    break;	
		case 3:
			System.out.println("enter a number");
		break;	
		case 4:
			System.out.println("wednesaday");
		break;	
		case 5:
			System.out.println("thursday");
		break;	
		case 6:
			System.out.println("friday");
		break;	
			case 7:
				System.out.println("saturday");
			break;
			default:
				System.out.println("invalid input!!");
				
				break;
			
			}
		
	}

}
