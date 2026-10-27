package studentinformationsystem; // Declare the package name
/**
 * Author         : Aufa Nazuha Binti Mohd Nazri
 * Program Name   : StudentInformationSystem.java
 * Description    : To display student information system.
 * Date           : 23 October 2026
 * Modified Date  : None
 * Version        : 1.0
 */
public class StudentInformationSystem { // Declare the StudentInformationSystem class
    public static void main(String[] args) { // Main method the starting point of the program
        
        System.out.println ("Student Name : Aufa Nazuha Binti Mohd Nazri - CSF3034"); // To display Student Name
        System.out.println ("Student ID : S85139"); // To display Student ID
        
        int mark1 = 67; // Store marks in variables
        int mark2 = 76; // Store marks in variable
        int total = mark1 + mark2; //Calculate total marks

        System.out.println("Mark 1: " + mark1); // Display Mark 1
        System.out.println("Mark 2: " + mark2); // Display Mark 2
        System.out.println("Total Marks: " + total); // Display Total Marks

        if (total >= 80) { // Check if total marks are 80 or above
            System.out.println("Result: Excellent - Proud of you!!"); // Display message 'Excellent' when total marks are 80 or above
        } else if (total >= 50) { // Check if total marks are 50 or above
            System.out.println("Result: Good"); // Display message 'Good' when total marks are 50 or above
        } else { // Check if total marks less than 50
            System.out.println("Result: Needs Improvement"); // Display message 'Needs Improvement' when total marks less than 50
        }
    }   
}

       
               



        