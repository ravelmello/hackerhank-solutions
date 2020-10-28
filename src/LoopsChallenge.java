import java.util.Scanner;

/**
 * Author: Ravel Mello
 * Created at: 28/10/2020
 */

public class LoopsChallenge {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(n +" x " + i + " = " + n*i);
        }
    }

}
