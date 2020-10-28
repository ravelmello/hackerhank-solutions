import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 * Author: Ravel Mello
 * Created at: 26/10/2020
 */

public class MealCost {
    static double tip(double mealCost, int tipPercent) {
        double resultTip;
        resultTip = mealCost * tipPercent/100;
        return resultTip;
    }

    static double tax(double mealCost, int taxPercent) {
        double resultTip;
        resultTip = mealCost * taxPercent/100;
        return resultTip;
    }

    static int total(double mealCost, int tax, int tip) {
        double totalToCalculate;
        totalToCalculate = tax(mealCost,tax) + tip(mealCost,tip) + mealCost;

        int totalCost = new BigDecimal(totalToCalculate)
                .setScale(0, RoundingMode.HALF_UP)
                .intValueExact();

        return totalCost;
    }


    public static void main(String[] args) {
        double mealCost;
        int tipPecent;
        int taxPercent;

        Scanner scan = new Scanner(System.in);

        mealCost = Double.parseDouble((scan.nextLine()));
        tipPecent = Integer.parseInt((scan.nextLine()));

        taxPercent = Integer.parseInt((scan.nextLine()));


        System.out.println(total(mealCost, taxPercent, tipPecent));

    }
}
