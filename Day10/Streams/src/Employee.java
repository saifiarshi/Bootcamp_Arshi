/**
 * Created by saifia on 7/29/2017.
 */


public class Employee {
    int id;

    double salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(int id,  double salary) {

        this.id = id;

        this.salary = salary;
    }
}
