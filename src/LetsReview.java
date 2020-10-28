import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Author: Ravel Mello
 * Created at: 28/10/2020
 */

public class LetsReview {

    static void returnTexts(String s){

        String evenText = "";
        String oddText = "";

        for(int i = 0; i < s.length(); i++){
            if(i%2==0){
               evenText += String.valueOf(s.charAt(i));
            } else {
                oddText += String.valueOf(s.charAt(i));
            }
        }

        System.out.println(evenText + " " + oddText);

    }

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scanner.nextInt();

        for(int i = 0; i < n; i++){
            String s = scanner.next();
            returnTexts(s);
        }

    }

}
