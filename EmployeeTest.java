import java.io.*;

public class EmployeeTest{

    public static void main( String args[] ){
        // Create two objects using constructor
        Employee empOne = new Employee( "Ta Yi" );
        Employee empTwo = new Employee( "Highlight Clark");
        
        // Invoking methods for each object created
        empOne.empAge( 20 );
        empOne.empDesignation( "Counting Student");
        empOne.empSalary( 100 );
        empOne.printEmployee( );

        empTwo.empAge( 24 );
        empTwo.empDesignation( "Robot Student");
        empTwo.empSalary( 1700 );
        empTwo.printEmployee( );
    }
}
