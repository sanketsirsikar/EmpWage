package Com.BridgeLabz.EmployeeWage;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Employee Wage Problem");

        int empCheck = (int) Math.floor(Math.random() * 10) % 2;
        if (empCheck == 1) {
            System.out.println("Employee is present ");
        } else {
            System.out.println("Employee is Absent");
        }
    }
}




