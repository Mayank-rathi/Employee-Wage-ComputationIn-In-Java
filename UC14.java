import java.util.*;

public class UC14 {
	static ArrayList<EmployeeWage> list = new ArrayList<EmployeeWage>();
	public static void printWages() {
		for (int i = 0; i < list.size(); i++) {
			list.get(i).calculateEmpWage();
			list.get(i).printMap();
		}
	}
	public static void findCompany(String company) {
	System.out.println("Total Wagas of "+company+" : ");
		for (int i = 0; i < list.size(); i++) {
			list.get(i).getCompanyWage(company);
		}
	}

	public static void main(String args[]) {
		UC14  obj = new UC14();
		list.add(new EmployeeWage("D-Mart", 20, 2, 10));
		list.add(new EmployeeWage("N-Mart", 20, 2, 10));
		list.add(new EmployeeWage("P-Mart", 20, 3, 10));
		obj.printWages();
		obj.findCompany("D-Mart");
	}
}
