public class EmployeeWageBuilderMethod_UC9_UC10 {
//Constant
public static final int IS_PART_TIME = 1;
public static final int IS_FULL_TIME = 2;
//Variable
private final String company;
private final int empRateHr;
private final int numOfWorkingDay;
private final int maxHourPerMonth;

public EmployeeWageBuilderMethod (String company, int empRateHr, int numOfWorkingDay, int maxHourPerMonth) {
	this.company = company;
	this.empRateHr = empRateHr;
	this.numOfWorkingDay = numOfWorkingDay;
	this.maxHourPerMonth = maxHourPerMonth;
}
public void calculateEmpWage() {
	int totalEmpHrs = 0, totalWorkingDays = 0, totalEmpWage = 0;
//Computation
	while (totalEmpHrs <= maxHourPerMonth && totalWorkingDays < numOfWorkingDay) {
		int empHrs = 0;
		int empWage = 0;
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
		empWage = empHrs * empRateHr;
		totalEmpWage += empWage;
		System.out.println("Employee Wage "+totalWorkingDays+ " " + empWage);
	}
	System.out.println("Total Employee Wage " + totalEmpWage);
}
public static void main(String [] args) {
	EmployeeWageBuilderMethod dMart = new EmployeeWageBuilderMethod("Dmart", 10, 30, 20);
	dMart.calculateEmpWage();
	EmployeeWageBuilderMethod bigbazaar = new EmployeeWageBuilderMethod("BigBazaar", 8, 30, 30);
	dMart.calculateEmpWage();
	}
}




