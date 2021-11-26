package module4;

public class EMP {
	public EMP(int empId, String ename, double sal) {
		super();
		this.empId = empId;
		this.ename = ename;
		this.sal = sal;
	}
	private int empId;
	private String ename;
	private double sal;
	
   public EMP()
   {
	  empId=0;
	  ename=" ";
	  sal=0.0;
   }
   public void EMP(int empId,String ename, double sal)
   {
	this.empId=empId;
	this.ename=ename;
	this.sal=sal;
   }
@Override
public String toString() {
	return "EMP [empId=" + empId + ", ename=" + ename + ", sal=" + sal + "]";
}
   

}
   
   
	
	


