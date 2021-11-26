package exceptionpack;

public class SingleException {
	public static int divide(int a,int b)
	{
		return(a/b);
	}

	public static void main(String[] args) {
///fun1();  //works , can call directly , without createing any object  //1
        
      //  SingleException o=new SingleException();  //2
     //   o.fun1();
        
  //      SingleException.fun1();  //3   : class level 
        //class         method
        
        
  //  }
//    public static void fun1()
 //   {
     //   System.out.println("priti");
		int num1=100;
		int num2=10;
		int result;
		
		try 
		{
			result = divide(num1,num2);
			System.out.println("the result is "+ result);
		
		}
		catch(ArithmeticException e)
		{
			System.out.println("can not divide by 0");
		}
	//	 System.out.println(e);
//       System.out.println(e.getMessage());
    //   e.printStackTrace();  //shows the line number and teh function name   
   } 
		
		 finally
         {
             System.out.println("this is my finally !!!");
         }
		
  }
	

}
