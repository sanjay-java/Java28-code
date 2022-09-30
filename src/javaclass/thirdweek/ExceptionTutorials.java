package javaclass.thirdweek;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.SQLException;
import java.text.ParseException;

public class ExceptionTutorials {

    public static void main(String[] args) {

         // arithmetic();
         try {
             fileProcess();
         }catch (FileNotFoundException fe){
             System.out.println("inside main method , catch block");
             fe.printStackTrace();
         }

    }

    private static void fileProcess() throws FileNotFoundException, SQLException, ParseException {

        File f = new File("abvd.txt");
        try {
            InputStream is = new FileInputStream(f);

                arryIndex();

        }catch (FileNotFoundException | SQLException | ParseException e){
            System.out.println(e.getMessage());
            // suppress it

            // bubble it up
            throw e;
        }

        System.out.println(f.getName());
    }
// try , catch

    private static void arryIndex() throws ParseException, SQLException {
        int a[] = {0,1,3,4,5};
        System.out.println(a[2]/a[0]);
    }
// RunTimeException ( unchecked exceptions) - don't need to handle at compile time
// CheckedExceptions - compile time , need to handle
    // multi catch

    // finally, and Exception class hierarchy

    // File library  java.io

    private static void arithmetic(){

        int a = 5;

        int b = 0;

        try{
            int c = a/b;
            System.out.println("Value of c is :"+ c);
        }catch (ArithmeticException ae){
            System.out.println("Inside a catch block , as there is an exception"+ ae.getMessage());
            throw ae;
        }

        System.out.println("Program ended");
    }

}
