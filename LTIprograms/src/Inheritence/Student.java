package Inheritence;

public class Student extends Person {

	protected int roll;
    protected char grade;
    protected double marks;
    protected String stream;
    
    
	
	public Student(String name, char gender, int age, int roll, char grade, double marks, String stream) {
		super(name, gender, age);
		this.roll = roll;
		this.grade = grade;
		this.marks = marks;
		this.stream = stream;
	}



	@Override
	public String toString() {
		return "Person [roll=" + roll + ", grade=" + grade + ", marks=" + marks + ", stream=" + stream + "]";
	}
    
    
	}


