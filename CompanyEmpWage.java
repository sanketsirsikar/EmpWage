package Com.BridgeLabz.EmployeeWage;
public class CompanyEmpWage{
    public final String COMPANY_NAME;
    public final int TOTAL_WORKING_HOURS;
    public final int WORKING_DAYS_PER_MONTH;
    public final int WAGE_PER_HOUR;
    public int total_wage;

    public CompanyEmpWage(String COMPANY_NAME, int WAGE_PER_HOUR, int WORKING_DAYS_PER_MONTH, int TOTAL_WORKING_HOURS) {
        this.COMPANY_NAME = COMPANY_NAME;
        this.WAGE_PER_HOUR = WAGE_PER_HOUR;
        this.WORKING_DAYS_PER_MONTH = WORKING_DAYS_PER_MONTH;
        this.TOTAL_WORKING_HOURS = TOTAL_WORKING_HOURS;
    }
    public void setTotal_wage(int total_wage){
        this.total_wage = total_wage;
    }

    @Override
    public String toString() {
        return "CompanyEmpWage{" +
                "COMPANY_NAME='" + COMPANY_NAME + '\'' +
                ", TOTAL_WORKING_HOURS=" + TOTAL_WORKING_HOURS +
                ", WORKING_DAYS_PER_MONTH=" + WORKING_DAYS_PER_MONTH +
                ", WAGE_PER_HOUR=" + WAGE_PER_HOUR +
                ", total_wage=" + total_wage +
                '}';
    }
}