import java.util.*;
class EmployeeSalaryCalculator{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Emp name :");
        String emp_name=sc.nextLine();
        System.out.print("Basic sal : ");
        double basic_sal=sc.nextDouble();
        System.out.println();
        System.out.println("========== Employee Salary Details ==========");
        System.out.println("Employee Name        : "+emp_name);
        System.out.println("Basic salary         : "+basic_sal);
        double hra = basic_sal * 20/100;  //House rent allowance
        System.out.println("House rent allowance : "+hra);
        double da = basic_sal *10/100;   //Dearness allowance(to help employees manage the increased cost of living)
        System.out.println("Dearness allowance   : "+da);
        double net_sal= basic_sal + hra + da;
        System.out.println("Net Salary           : "+net_sal);
    }
}
