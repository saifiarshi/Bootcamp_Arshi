import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Stream;

/**
 * Created by saifia on 7/29/2017.
 */
/*Create a class called Employee and create atleast 50 employees.
        Then only filter those who are getting more then 50000.00 and
        then calculate there tds as 10% and show the total of tds.

        Plus meet below requirements also :
        a) Average of all employee salaries per month
        b) Total salary paid to all per month
        c) Who is getting minimum salary
        d) Who is getting maximum salary
        e) How many employees are there in the company*/
public class EmployeeTest {
    public static void main(String[] args) {
        EmployeeTest e = new EmployeeTest();
        e.userCaseOne();
        e.userCaseTwo();
    }


    public static List<Employee> createTestData() {
        Employee e1 = new Employee(188, 212);
        Employee e2 = new Employee(1433, 822);
        Employee e3 = new Employee(776, 1562);
        Employee e4 = new Employee(756, 1562);
        Employee e5 = new Employee(756, 4562);
        Employee e6 = new Employee(7346, 462);
        Employee e7 = new Employee(7116, 4562);
        Employee e8 = new Employee(76, 4152);
        Employee e9 = new Employee(761, 1562);
        Employee e10 = new Employee(716, 41);
        Employee e11 = new Employee(176, 5162);
        List <Employee> employeeList = new ArrayList <>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);
        employeeList.add(e6);
        employeeList.add(e7);
        employeeList.add(e8);
        employeeList.add(e9);
        employeeList.add(e10);
        employeeList.add(e11);
        return employeeList;
    }

    private static void userCaseOne() {

        List <Employee> list = createTestData();
         Stream<Employee> stream = list.stream().filter(employee -> employee.getSalary()>500);
        Optional <Double> total = stream.map(employee -> employee.getSalary() / .10).reduce((a, b) -> a + b);

        System.out.println("Result  : " + total.get());
    }
    private void userCaseTwo(){
        List <Employee> list = createTestData();
        double averageSal= list.stream().map(employee -> employee.getSalary()).reduce((a, b)->a+b).get()/12;
        System.out.println("average : " + averageSal);
    }

    @Test
    public void testMinimumSalariedEmployee() {
        List <Employee> list = createTestData();
        Employee emp = list.stream().min((x,y)->(int)(x.getSalary()-y.getSalary())).get();
        System.out.println(emp.getSalary());
    }

    @Test
    public void testMaximumSalariedEmployee() {
        List <Employee> list = createTestData();
        Employee emp = list.stream().max((x, y)->(int)(x.getSalary()-y.getSalary())).get();
        System.out.println(emp.getSalary());
    }
}
