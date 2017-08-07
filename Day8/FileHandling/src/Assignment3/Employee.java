package Assignment3;

import java.io.Serializable;

/**
 * Created by saifia on 7/27/2017.
 */
/*Write a program which will hold 10-50 employees in an array list.
        Application will first find those employees who are getting salary
        more then 40000 per month and then will sort them.
        And application will save sorted ones in a file before quiting
        with full details except their salaries and the will retrieve
        them and display the details on console in sorted way only
        based on natural sorting decided by eid field.
*/
public class Employee implements Comparable<Employee>,Serializable{
    private int empId;
    private String name;
    transient private double salary;

    @Override
    public String toString() {
        return "Assignment3.Employee{" +
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


    @Override
    public int compareTo(Employee e) {
        if(this.empId==e.empId)
            return 0;
        if (this.empId>e.empId)
            return 1;
        else return -1;
    }
}
