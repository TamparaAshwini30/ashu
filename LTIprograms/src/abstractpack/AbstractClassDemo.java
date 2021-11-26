package abstractpack;

public class AbstractClassDemo {

	public static void main(String[] args) {
		 Dog tuffy=new Dog();
         tuffy.sound();
         tuffy.classInfo("dog");
         System.out.println("=============================");
         System.out.println("creating lion class obj");
         Lion simba=new Lion();
         simba.sound();
         simba.classInfo("lion");
 




		

	}

}
abstract class Animal  // 1
{
	int legs=4;
	abstract void sound();
	void classInfo(String type)
	{
		System.out.println("I belongs to " + type + " family");
	}
}
class Dog extends Animal{   //2
	void sound()
	{
		System.out.println("woof woof..");
		System.out.println("I have "+ legs + " legs..") ;
    }
}
class Lion extends Animal{  //2
    void sound()
    {
        System.out.println("Roar  ...........");
        System.out.println("I have "+ legs + " legs..") ;
	}
	
}

