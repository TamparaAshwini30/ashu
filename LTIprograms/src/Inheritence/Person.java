
package Inheritence;

public class Person {

	
	    protected String name;
	    protected char gender;
	    protected int age;
	    
	    public Person(String name, char gender, int age)
	    {
	    	super();
	        this.name = name;
	        this.gender = gender;
	        this.age = age;
	    }
@Override
	    public String toString() {
	        return "Person [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	    }
	    
	    public void fun1()
	    {
	        System.out.println("this fun1 function from Parent class");
	    }
}
