package Assignment1;

import jdk.internal.util.xml.impl.Input;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
/*Write a program which will read a file which contains
   a) movie name
           b) actors
           c) directors
           d) duration

           and display on console properly.*/
/**
 * Created by saifia on 7/27/2017.
 */
public class FileDisplay {
    public static void main(String[] args) throws IOException {
        InputStream fis = null;
        try{
            fis = new FileInputStream("C:/javatraining/Movie.txt");
            int b = fis.read();
            while(b!=-1){
                System.out.print((char)b);
                b=fis.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(fis!=null)
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
