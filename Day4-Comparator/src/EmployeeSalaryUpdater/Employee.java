package EmployeeSalaryUpdater;

/**
 * Created by saifia on 8/2/2017.
 */
public class Employee {
    private int empId;
    private String name;
    private double salary;

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(int empId, String name, double salary) {

        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    public double calHRA(double salary) {
        return .17*salary;
    }


}
