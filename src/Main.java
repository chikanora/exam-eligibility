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
        hasPassedPreReq = input.next().trim().equalsIgnoreCase("yes");

        System.out.println("Has the student completed all assignments? (yes/no): ");
        hasCompletedAssignments = input.next().trim().equalsIgnoreCase("yes");

        System.out.println("Does the student got a valid exam token? (yes/no): ");
        hasValidExamToken = input.next().trim().equalsIgnoreCase("yes");

        System.out.println("-----------------------------------");
        // If/Else logic
        if (hasPassedPreReq)
        {
            System.out.println("Did student passed their pre-requisites?" + " "  + hasPassedPreReq);
        }
        else if (!hasPassedPreReq)
        {
            System.out.println("Did student passed their pre-requisites?" + " "  + hasPassedPreReq);
        }

        if (hasCompletedAssignments)
        {
            System.out.println("Did student completed all of their assignments?" + " " + hasCompletedAssignments);
        }
        else if (!hasCompletedAssignments)
        {
            System.out.println("Did student completed all of their assignments?" + " " + hasCompletedAssignments);
        }

        if (hasValidExamToken)
        {
            System.out.println("Does student have a valid exam token?" + " " + hasValidExamToken);
        }
        else if (!hasValidExamToken)
        {
            System.out.println("Does student have a valid exam token?" + " " + hasValidExamToken);
        }

        // If student does not pass either or all the requirement to take the exam, deny them
        if (!hasPassedPreReq || !hasCompletedAssignments || !hasValidExamToken)
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