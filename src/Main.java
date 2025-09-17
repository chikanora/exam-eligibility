import java.util.*;

/**
 * Exam Eligibility Checker for CMPS-3000-BCB
 * Group - NO NAME (Ronald Tran & Jericko)
 * Code Developed by Ronald Tran
 * Date: September 16, 2025
 *
 * Disclaimer: Other than group members and the instructor, I do not give permission to anyone using my code.
 */

public class Main
{
    public static void main(String[] args)
    {
        // Creating the Scanner variable "input"
        Scanner input = new Scanner(System.in);

        // Boolean variables
        boolean hasPassedPreReq;
        boolean hasCompletedAssignments;
        boolean hasValidExamToken;

        // Prompt the examiner/user series of questions and for inputs
        System.out.println("Online Exam Eligibility Checker");
        System.out.println("----------------------------------");

        System.out.println("Has the student passed the prerequisites? (yes/no): ");
        hasPassedPreReq = input.nextLine().trim().equalsIgnoreCase("yes");

        System.out.println("Has the student completed all assignments? (yes/no): ");
        hasCompletedAssignments = input.nextLine().trim().equalsIgnoreCase("yes");

        System.out.println("Does the student got a valid exam token? (yes/no): ");
        hasValidExamToken = input.nextLine().trim().equalsIgnoreCase("yes");

        // If/Else logic
        if (!hasPassedPreReq && !hasCompletedAssignments && !hasValidExamToken)
        {
            // If any of the booleans are false, prompt this message
            System.out.println("DENIED: Student must complete all requirements and have a valid exam token.");
        }
        else
        {
            // If all the booleans are true, prompt this message
            System.out.println("GRANTED: Student met all requirements and is eligible to take the exam.");
        }
    }
}