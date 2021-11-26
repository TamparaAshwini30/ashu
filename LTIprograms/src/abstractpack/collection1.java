package abstractpack;
import java.util.*;
public class collection1 {

	public static void main(String[] args) {
	List employees=new ArrayList();
	employees.add("arka");
	employees.add("dhya");
	employees.add("20");
	employees.add("8989.66f");
	employees.add(87.44);
	
	for(int i=0;i< employees.size() ;i++)
	{
		System.out.println(employees.get(i));
	}
	System.out.println("======");
	Iterator itr=employees.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	employees.add("sudeepa");
	employees.remove("sudeepa");
	
	System.out.println("index is" + employees.indexOf("sudeepa"));
	System.out.println(employees.contains("sudeepa"));
	
	employees.remove(2);
	employees.clear();
	employees.isEmpty();
	}

}
