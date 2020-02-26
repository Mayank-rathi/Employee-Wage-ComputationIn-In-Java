public class EmployeeWageBuilderUC7{
   //Constant
   public static final int IS_PART_TIME = 1;
   public static final int IS_FULL_TIME = 2;

 	private final String company;
	private final int empRateHr;
	private final int numOfWorkingDay;
	private final int maxHourPerMonth;

	public EmployeeWageBuilderUC7(String company, int empRateHr, int numOfWorkingDay, int maxHourPerMonth) {
	this.company = company;
	this.empRateHr = empRateHr;
	this.numOfWorkingDay = numOfWorkingDay;
	this.maxHourPerMonth = maxHourPerMonth;
}

	public static void main(String [] args){
 		EmployeeWageBuilderUC7 dMart = new EmployeeWageBuilderUC7("Dmart", 20, 2, 10);

   //variable
	//	int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
		 int empHrs = 0 ;
       int empWage =0;

	//Computation
	while (totalEmpHrs <= dMart.maxHourPerMonth && totalWorkingDays <  dMart.numOfWorkingDay){
			totalWorkingDays++;
		int empCheck=(int) Math.floor(Math.random() * 10) % 3;
		switch(empCheck){
			case IS_FULL_TIME:
				empHrs=8;
				break;
			case IS_PART_TIME:
				empHrs=4;
				break;
			default:
				empHrs = 0;
				break;
			}
		}
      empWage = emprHr * dMart.maxHourPerMonth;
      totalEmpWage += empWag;
		totalHrs += empWag;
			System.out.println("Employee Wage" + empWage);
			System.out.println("Total Employee Wage" + totalEmpWage);
		}
}




