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

        // Variables
        int A = readBit(input, "A = Login Status (1 - logged in, 0 = not logged in): ");
        int B = readBit(input, "B = Course Enrollment (1 = enrolled, 0 = not enrolled): ");
        int C = readBit(input, "C = Final Assignment Requirement (1 = submitted, 0 = not submitted): ");
        int D = readBit(input, "D = Exam Time Frame (1 = within window, 0 = not within window): ");

        // Decision: Y = A AND B AND C AND D if student met all the requirements to take the exam
        int Y = (A == 1 && B == 1 && C == 1 && D == 1) ? 1 : 0;

        System.out.println("Online Examination Eligibility System");
        System.out.println("Enter each input as 1 (true) or 0 (false)");
        System.out.println("--------------------------------------------");

        // Prompt inputs
        System.out.println("A (Login)            = " + A);
        System.out.println("B (Enrollment)       = " + B);
        System.out.println("C (Assignment)       = " + C);
        System.out.println("D (Exam Time Frame)  = " + D);

        // Output the result
        System.out.println("Y (Exam Access) = " + Y);

        // If/else statement
        if (Y == 1)
        {
            System.out.println("GRANTED: Student meets all conditions and may access the exam.");
        }
        else
        {
            System.out.println("DENIED: Student has not met one or all the conditions (A, B, C, and D) to access the exam.");
        }
    }

    // Read bits (0/1) with simple validation method
    private static int readBit(Scanner input, String prompt)
    {
        // Stays in the while loop until the user either enters 1 or 0 to get out of it
        while (true)
        {
            System.out.print(prompt);
            String token = input.next().trim();

            if (token.equals("0") || token.equals("1"))
            {
                return Integer.parseInt(token);
            }

            System.out.println("Invalid input: Please enter either 1 or 0.");
        }
    }
}