package module5;

public class FunctionoverloadingDemo {

	public int sum(int a, int b)
		    {
		        return (a+b);
		    }
		    public double sum(double a, int b)
		    {
		        return (a+b);
		    }
		    public double sum(int a, double b)
		    {
		        return (a+b);
		    }
		    public float sum(float a, int b)
		    {
		        return (a+b);
		    }

		 

		    
		    public static void main(String[] args) {
		    	FunctionoverloadingDemo.obj=new FunctionoverloadingDemo();
		        System.out.println(obj.sum(10, 20));  //30    1
		        
		        System.out.println(obj.sum(10.99, 23));  //2
		        
		        System.out.println(obj.sum(10, 33.33));  //3
		        
		        System.out.println(obj.sum(10.77f, 20));  //4

	}

}
