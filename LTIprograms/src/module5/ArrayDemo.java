package module5;
import java.util.Scanner;
public class ArrayDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] num=new int[5];//0 12 34
		System.out.println("enter the 5 ineteger values");
		for(int i=0;i<5;i++)
		{
			num[i]=sc.nextInt();
			
		}
		System.out.println(" =========");
		System.out.println("display array");
		//to display
		for(int i=0;i<5;i++)
		{
			System.out.println(num[i]);
		}
		System.out.println("===========");
		System.out.println("enhanced for loop");
		/// enhanced loop
		for(int a: num)
		{
			System.out.println(a);
		}
	
		
	
	
	}

}
