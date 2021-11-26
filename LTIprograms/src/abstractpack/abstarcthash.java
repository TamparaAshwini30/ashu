package abstractpack;

public class abstarcthash {

	public static void main(String[] args) {
		 private int empno;
		    private String ename;
		    
		    //constructor , to sting , getter setter
		    
		    public Emp(int empno, String ename) {
		        super();
		        this.empno = empno;
		        this.ename = ename;
		    }

		 

		    
		    public int getEmpno() {
		        return empno;
		    }

		 


		    public void setEmpno(int empno) {
		        this.empno = empno;
		    }

		 


		    public String getEname() {
		        return ename;
		    }

		 


		    public void setEname(String ename) {
		        this.ename = ename;
		    }

		 


		    @Override
		    public String toString() {
		        return "Emp [empno=" + empno + ", ename=" + ename + "]";

	}

}
