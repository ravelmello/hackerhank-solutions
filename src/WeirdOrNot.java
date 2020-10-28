import java.util.Scanner;

/**
 * Author: Ravel Mello
 * Created at: 26/10/2020
 */

public class WeirdOrNot {

    static boolean isEven(int n){
        boolean number = true;
        if(n%2 != 0){
            number=false;
        }
        return number;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        isEven(N);

        if(!isEven(N)){
            System.out.println("Weird");
        } else if(isEven(N) && (N>=2 && N <=5)){
            System.out.println("Not Weird");
        } else if(isEven(N) && (N>=6 && N <=20)){
            System.out.println("Weird");
        } else {
            System.out.println("Not Weird");
        }

    }

}
