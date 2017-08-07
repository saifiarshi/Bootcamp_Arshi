package EmployeeSalaryUpdater;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by saifia on 8/2/2017.
 */
public class EmployeeData {
    public static void main(String[] args) {
        EmployeeData e=new EmployeeData();
        e.createTestData();
    }

    public static double updateSalary(Employee e){
        if(e.getSalary()<20000){
            return e.getSalary()+e.getSalary()*.2;
        }else return e.getSalary();
    }


    public static void createTestData() {
        Employee e1 = new Employee(13,"ramesh", 24412);
        Employee e2 = new Employee(133,"ram", 8122);
        Employee e3 = new Employee(76,"shyam",41562);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
//        for (Employee e:employeeList
//             ) {
//            System.out.println("name"+e.getName()+"salary"+updateSalary(e));
//        }
        Iterator<Employee> itr = employeeList.iterator();

        while (itr.hasNext()){
            Employee next = itr.next();
//            System.out.println(next.getSalary());
//            System.out.println("=============");
            System.out.println(EmployeeData.updateSalary(next));
        }

    }
}
