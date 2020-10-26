import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmpData
{
    public String id;
    public String name;
    public String salary;

    public EmpData(String id, String name, String salary) {
        super();
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return "id=" + id + " Name='" + name + '\'' + "  Salary=" + salary;
    }
}

class EmployeePayrollService {
    private List<EmpData> empPayList;

    public EmployeePayrollService() {

    }

    public EmployeePayrollService(List<EmpData> employeePayrollList) {
        this.empPayList = employeePayrollList;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Employee Payroll Service");
        ArrayList<EmpData> empPayList = new ArrayList<>();
        EmployeePayrollService employeePayrollService = new EmployeePayrollService(empPayList);
        Scanner consoleInputReader = new Scanner(System.in);
        employeePayrollService.readEmpData(consoleInputReader);
        employeePayrollService.writeEmployeePayrollData();

    }

    private void writeEmployeePayrollData()
    {
        System.out.println("\nWriting Employee Payroll Roaster to Console\n" + empPayList);
    }

    public EmpData readEmpData(Scanner input) {
        System.out.println("Enter ID of Employee:");
        String name=input.nextLine();
        System.out.println("Enter your id");
        String id=input.nextLine();
        System.out.println("Enter your salary");
        String salary = input.nextLine();
        return new EmpData(name,id,salary);
    }
}

