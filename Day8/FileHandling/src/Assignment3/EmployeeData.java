package Assignment3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by saifia on 7/27/2017.
 */
public class EmployeeData {
    public static void main(String[] args) {
        EmployeeData e = new EmployeeData();
        List <Employee> employeeList = e.createTestData();
        List <Employee> list = new ArrayList <>();
        Iterator <Employee> itr = employeeList.iterator();
        while (itr.hasNext()) {
            Employee emp = itr.next();
            if (emp.getSalary() > 40000) {
                list.add(emp);
            }
        }
//        System.out.println(list);
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {fos = new FileOutputStream("C:\\javatraining/EmployeeFile.txt");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(list);


            System.out.println("Done");

        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }



    public static List<Employee> createTestData() {
        Employee e1 = new Employee(1,"ramesh", 24412);
        Employee e2 = new Employee(21,"ram", 8122);
        Employee e3 = new Employee(2761,"ram", 812211);
        Employee e4 = new Employee(716,"shyam",61562);
        Employee e5 = new Employee(7316,"shyam",91562);
        Employee e6 = new Employee(766,"shyam",4562);
        Employee e7 = new Employee(769,"shyam",41562);
        Employee e8 = new Employee(16,"shyam",10562);
        Employee e9 = new Employee(56,"shyam",81562);
        Employee e10 = new Employee(276,"shyam",91562);
        Employee e11= new Employee(776,"shyam",61562);
        Employee e12 = new Employee(476,"shyam",11562);
        Employee e13 = new Employee(876,"shyam",31562);
        Employee e14 = new Employee(176,"shyam",51562);
        List<Employee> employeeList = new ArrayList<>();
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
        employeeList.add(e12);
        employeeList.add(e13);
        employeeList.add(e14);

//        for (Assignment3.Employee e:employeeList){
//            if(e.getSalary()>40000){
//                employeeList.add(e);
//            }
//        }
        return employeeList;
    }
}
