package module3;

public class WhileDemo {

	public static void main(String[] args) {
		int a=1;
		while(a<=10)
		{
			System.out.println(a);
			a++;
		}
   // display first 10 odd numbers
		int c=1;
		 while(c<=20)
		 {
			 if(c%2!=0)
			 System.out.println(c);
			 c++;
		 }
		 ///// factorial
		 int b=4;
		 int fact=1;
		 while(b>=1)
		 {
			 fact=fact*b;
			 b--;
		 }
		 System.out.println("the factoral of the number:"+fact);
	}

}
