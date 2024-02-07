class Employee {
    private int empId;
    private String empName;
    private double empSalary;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getempSalary() {
        return empSalary;
    }

    public void setempSalary(double empSalary) {
        this.empSalary = empSalary;
    }
}

public class Encapsulation {
    public static void main(String[] args) {

        Employee employee = new Employee();

        employee.setEmpId(111);
        employee.setEmpName("Yashashvi Thakur");
        employee.setempSalary(100000.0);


        System.out.println("Employee ID: " + employee.getEmpId());
        System.out.println("Employee Name: " + employee.getEmpName());
        System.out.println("Salary: " + employee.getempSalary());
    }
}
