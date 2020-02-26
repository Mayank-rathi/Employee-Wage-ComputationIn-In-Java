import java.util.*;

class EmployeeWage {
   //Constant
	public static final int IS_PART_TIME = 1;
   public static final int IS_FULL_TIME = 2;
	HashMap<Integer, Integer> comapnyInfo = new HashMap<Integer,Integer>();
	HashMap<String, Integer> companyTotalWage = new HashMap<String, Integer>();

	//Variables
	public final String company;
   public final int empRateHr;
   public final int numOfWorkingDay;
   public final int maxHourPerMonth;

   public EmployeeWage (String company, int empRateHr, int numOfWorkingDay, int maxHourPerMonth) {
      this.company = company;
      this.empRateHr = empRateHr;
      this.numOfWorkingDay = numOfWorkingDay;
      this.maxHourPerMonth = maxHourPerMonth;
   }
	public void calculateEmpWage() {
		int totalEmpHrs = 0,totalWorkingDays = 0,totalEmpWage = 0;
		System.out.println("Company Name is " +company);
		//Computation
		while (totalEmpHrs <= maxHourPerMonth && totalWorkingDays < numOfWorkingDay) {
			int empHrs = 0;
			int empWage = 0;
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch(empCheck){
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
			totalEmpHrs += empHrs;
			empWage = (totalEmpHrs * empRateHr);
	    	totalEmpWage+=empWage;
			comapnyInfo.put(totalWorkingDays, empWage);
		}
		companyTotalWage.put(company, totalEmpWage);
	}
		public void printMap() {
			System.out.println("...."+company+".....");
			for (int i:comapnyInfo.keySet()) {
				System.out.println("Day "+i+" : "+comapnyInfo.get(i));
			}
		}
		public void getCompanyWage(String company) {
			if(companyTotalWage.get(company)!=null) {
				System.out.println(company +" "+companyTotalWage.get(company));
			}
		}
}





