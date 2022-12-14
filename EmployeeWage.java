package Com.BridgeLabz.EmployeeWage;

public class EmployeeWage{
    static final int IS_FULL_TIME = 2;
    static final int IS_PART_TIME = 1;

    private int NUM_OF_COMPONY = 0;
    private CompanyEmpWage[] ComponyEmpWageArray;

    public EmployeeWage() {
        ComponyEmpWageArray = new CompanyEmpWage[5];
    }

    private void addComponyEmpWage(String COMPONY_NAME, int WAGE_PER_HOUR, int WORKING_DAYS_PER_MONTH, int TOTAL_WORKING_HOUR) {
        ComponyEmpWageArray[NUM_OF_COMPONY] = new CompanyEmpWage(COMPONY_NAME, WAGE_PER_HOUR, WORKING_DAYS_PER_MONTH, TOTAL_WORKING_HOUR);
        NUM_OF_COMPONY++;
    }
    private void computeEmployeeWage() {
        for (int i = 0; i < NUM_OF_COMPONY; i++) {
            ComponyEmpWageArray[i].setTotal_wage(this.computeEmployeeWage(ComponyEmpWageArray[i]));
            System.out.println(ComponyEmpWageArray[i]);
        }
    }
    private int computeEmployeeWage(CompanyEmpWage componyEmpWage){
        int day = 1;
        int totalworkinghours = 0;
        int totalwage = 0;
        while(totalworkinghours <= componyEmpWage.WORKING_DAYS_PER_MONTH && totalworkinghours < componyEmpWage.WORKING_DAYS_PER_MONTH) {
            totalworkinghours++;
            int dailyWage = 0;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;

            switch (empCheck) {
                case IS_FULL_TIME:
                    System.out.println("Employee Full Time");
                    dailyWage = 8;
                    break;
                case IS_PART_TIME:
                    System.out.println("Employee Part Time");
                    dailyWage = 4;
                    break;
                default:
                    System.out.println("Employee Absent");
            }
            totalwage = totalwage + dailyWage;
            System.out.println("Daily Wage => "+day+ " => " + dailyWage);
            day++;
        }
        System.out.println("Total Wage => "+totalwage);
        return totalwage * componyEmpWage.WAGE_PER_HOUR;
    }

    public static void main(String[] args) {
        System.out.println("Start to the Employee Wages");
        EmployeeWage empwages = new EmployeeWage();
        empwages.addComponyEmpWage("Mindtree",10,2,10);
        empwages.addComponyEmpWage("Concentric",15,4,10);
        empwages.computeEmployeeWage();
    }
}

/* Ability to manage Employee
Wage of multiple
companies - Note: Refactor to have one
EmpWageBuilder to manage for Wage
for multiple Company
- Create CompanyEmpWage class and let
EmpWageBuilder has array of many
CompanyEmpWage Object*/
