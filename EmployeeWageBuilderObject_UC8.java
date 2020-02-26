public class EmployeeWageBuilderObject_UC8 {
   //Constant
   public static final int IS_PART_TIME = 1;
   public static final int IS_FULL_TIME = 2;
   private final String company;

   //Variable
   private final int empRateHr;
   private final int numOfWorkingDay;
   private final int maxHourPerMonth;

	public EmployeeWageBuilderObject (String company, int empRateHr, int numOfWorkingDay, int maxHourPerMonth) {
		this.company = company;
		this.empRateHr = empRateHr;
		this.numOfWorkingDay = numOfWorkingDay;
		this.maxHourPerMonth = maxHourPerMonth;
	}
	public static void main(String [] args) {
		EmployeeWageBuilderObject dMart=new EmployeeWageBuilderObject("Dmart", 20 , 2 , 10);
		int totalEmpHrs = 0, totalWorkingDays = 0, totalEmpWage = 0;
   	int empHrs = 0;
		int empWage = 0;

	//Computation
	while (totalEmpHrs <= dMart.maxHourPerMonth && totalWorkingDays <  dMart.numOfWorkingDay) {
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
		switch(empCheck) {
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			case IS_PART_TIME:
				empHrs = 4;
				break;
			default:
				empHrs = 0;
				break;
		}
      empWage = empHrs * dMart.maxHourPerMonth;
      totalEmpWage += empWage;
	}
			System.out.println("Employee Wage" + empWage);
			System.out.println("Total Employee Wage" + totalEmpWage);
	}
}




