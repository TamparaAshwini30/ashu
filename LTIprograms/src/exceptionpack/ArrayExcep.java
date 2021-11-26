package exceptionpack;

public class ArrayExcep {

	public static void main(String[] args) {
		try {
			int[] arr={10,44,67,89};
			System.out.println("the elements is"+arr[2]);
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("error : the index specified is not correct!!");
					System.out.println(e);
		}

	}

}
