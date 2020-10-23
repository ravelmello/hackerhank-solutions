import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DataTypes {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int i2, sumInt;
        double d2, sumDouble;
        String result, message;
        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        i2 = Integer.parseInt(scan.nextLine());
        d2 = Double.parseDouble(scan.nextLine());
        result = scan.nextLine();

        sumInt = i + i2;
        sumDouble = d + d2;
        message = s + result;


        /* Print the sum of both integer variables on a new line. */
        System.out.println(sumInt);
        /* Print the sum of the double variables on a new line. */
        System.out.println(sumDouble);
        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
        System.out.println(message);

        scan.close();
    }
}