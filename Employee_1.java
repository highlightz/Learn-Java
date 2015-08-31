import java.io.*;

public class Employee_1{
    // This instance variable is visible for any child class
    public String name;

    // Salary variable is visible in Employee_1 only.
    private double salary;

    // This is the constructor of the class Employee
    public Employee_1( String empName ){
        name = empName;
    }

    // Assign the salary to the variable salary.
    public void setSalary( double empSalary ){
        salary = empSalary;
    }

    // Print the Employee details
    public void printEmployee( ){
        System.out.println( "Name:" + name );
        System.out.println( "Salary:" + salary );
    }

    public static void main( String args[] ){
        Employee_1 empOne = new Employee_1( "Ransika" );
        empOne.setSalary( 1000 );
        empOne.printEmployee( );
    }
}
