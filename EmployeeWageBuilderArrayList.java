import java.util.*; 

public class EmployeeWageBuilderArrayList{

	public static void main(String [] args){
		EmployeeWage e0 = new EmployeeWage("Dmart",10,3,20);
    	EmployeeWage e1 = new EmployeeWage("Reliance",8,3,20);
		EmployeeWage e2 = new EmployeeWage("Nomart",8,2,20);
		EmployeeWage e3 = new EmployeeWage("Mmart",8,2,20);

		ArrayList<EmployeeWage> emp = new ArrayList<EmployeeWage>();
		emp.add(e0);
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		Iterator itr = emp.iterator();
		while(itr.hasNext()){
    		EmployeeWage emps = (EmployeeWage)itr.next();
			emps.calculateEmpWage();
  		}
    }
 }
