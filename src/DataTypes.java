import java.util.*;
public class DataTypes {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        int i2, sumInt;
        double d2, sumDouble;
        String result, message;
        i2 = Integer.parseInt(scan.nextLine());
        d2 = Double.parseDouble(scan.nextLine());
        result = scan.nextLine();

        sumInt = i + i2;
        sumDouble = d + d2;
        message = s + result;

        System.out.println(sumInt);
        System.out.println(sumDouble);
        System.out.println(message);

        scan.close();
    }
}