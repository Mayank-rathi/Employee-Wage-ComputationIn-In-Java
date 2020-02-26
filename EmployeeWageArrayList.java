class EmployeeWage{
   public static final int IS_PART_TIME = 1;
   public static final int IS_FULL_TIME = 2;

   public final String company;
   public final int empRateHr;
   public final int numOfWorkingDay;
   public final int maxHourPerMonth;

	public EmployeeWage (String company, int empRateHr, int numOfWorkingDay, int maxHourPerMonth)
   {
      this.company = company;
      this.empRateHr = empRateHr;
      this.numOfWorkingDay = numOfWorkingDay;
      this.maxHourPerMonth = maxHourPerMonth;
   }
	public void calculateEmpWage(){
		int totalEmpHrs = 0,totalWorkingDays = 0,totalEmpWage = 0;
		System.out.println("Company Name is " +company);
		//Computation
		while (totalEmpHrs <= maxHourPerMonth && totalWorkingDays < numOfWorkingDay){
			int empHrs = 0;
			int empWage = 0;
			totalWorkingDays++;
			int empCheck=(int) Math.floor(Math.random() * 10) % 3;
			switch(empCheck){
				case IS_FULL_TIME:
					empHrs=8;
					break;
				case IS_PART_TIME:
					empHrs = 4;
					break;
				default:
					empHrs = 0;
					break;
			}
      	empWage = empHrs * maxHourPerMonth;
      	totalEmpWage += empWage;
			System.out.println("Employee Wage Day " + totalWorkingDays + " Working Hrs " + empWage);
		}
  		System.out.println("Total Employee Wage " + totalEmpWage);
		System.out.println("--------------------------------------");
	}
}

public class EmployeeWageBuilderArray{
  public static void main(String [] args){
	EmployeeWage[] emp = new EmployeeWage[5];
	emp[0] = new EmployeeWage("Dmart",10,20,20);
	emp[1] = new EmployeeWage("Reliance",8,20,20);
	emp[2] = new EmployeeWage("Kmart",7,25,25);
   emp[3] = new EmployeeWage("Nmart",8,5,30);

		for (int i=0; i<4; i++)
		{
			emp[i].calculateEmpWage();
		}
	}
}




