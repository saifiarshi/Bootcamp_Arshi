package Assignment3;

import Assignment3.Employee;

import java.io.*;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Created by saifia on 7/28/2017.
 */
public class EmployeeFileRead {
    public static void main(String[] args) {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream("C:\\javatraining/EmployeeFile.txt");
            ois = new ObjectInputStream(fis);

            List<Employee> emp = (List<Employee>)ois.readObject();
            Collections.sort(emp);
            Iterator<Employee> itr = emp.iterator();
            while (itr.hasNext()){
                Employee e = itr.next();
                System.out.println(e);
            }
//            System.out.println(emp);
//            System.out.println(emp.getName());
//            System.out.println(emp.getSalary());
            }
        catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null)
                    fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}