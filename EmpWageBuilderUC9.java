public class EmpWageBuilderUC9 {
   int i = 0;
   EmployeeWage array[] = new EmployeeWage[5];

   public void add(String company, int empRateHr, int numOfWorkingDay, int maxHourPerMonth) {
       array[i] = new EmployeeWage(company, empRateHr, numOfWorkingDay, maxHourPerMonth);
       array[i].calculateEmpWage();
       i++;
   }

   public static void main(String args[]) {
       EmpWageBuilderUC9 obj = new EmpWageBuilderUC9();
		obj.add("D-Mart", 20, 3, 10);
		obj.add("BigBazar", 20, 2, 10);
		obj.add("Fmart", 20, 4, 10);
		obj.add("Kmart", 20, 5, 10);
   }
}

