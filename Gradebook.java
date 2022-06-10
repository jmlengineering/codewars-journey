/* Title : Gradebook

Instruction : Complete the function so that it finds the average of the three scores passed to it
and returns the letter value associated with that grade.
 */

import java.util.Scanner;


public class Gradebook {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Grade");
        int newGrade = input.nextInt();

        System.out.println("Your letter grade for " + newGrade + " is " + getGrade(int x));
    }

    public static void getGrade(int x) {
        if (x >= 90) {
            getGrade = 'A';
        }
        else if (x >= 80) {
            getGrade = 'B';
        }
        else if (x >= 70) {
            getGrade = 'C';
        }
        else if (x >= 60) {
            getGrade = 'D';
        }
        else {
            getGrade = 'F';
        }
    }
    return getGrade;
}
