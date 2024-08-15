/**
 * @author ravel_melo on 15/08/2024
 * @project hackerhank-solutions
 */
public class PayLemonades {
    public static void main(String[] args) {

        int[] bills = {10,5,5,10,20};

        System.out.println(lemonadeChange(bills));
        System.out.println(lemonade(bills));

    }

    public static boolean lemonadeChange(int[] bills) {
        int check5 = 0;
        int check10 = 0;

        boolean change = true;

        for(int i = 0; i < bills.length ; i++) {

            if(bills[i] == 5) {
                check5++;
            }
            else if(bills[i]==10) {
               if(check5 > 0) {
                   check10++;
                   check5--;
               } else {
                   change = false;
               }
            } else if( bills[i] == 20 ) {
                if(check5 > 0 && check10 > 0) {
                    check10 --;
                    check5 --;
                } else if(check5 >= 3) {
                    check5 = check5 - 3;
                } else {
                    change = false;
                }
            }
        }

        return change;
    }

    public static boolean lemonade(int[] bills) {
        int fiveCnt = 0, tenCnt = 0;

        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                fiveCnt++;
            } else if (bills[i] == 10) {
                tenCnt++;
                fiveCnt--;
            } else {
                if (tenCnt > 0) {
                    tenCnt--; // if have 10, use 10 first, as 5 is more flexble.
                } else {
                    fiveCnt -= 2; // use five to pay 10 change.
                }

                fiveCnt--; // use to pay the rest 5 change.
            }

            if (fiveCnt < 0) return false;
        }
        return true;
    }
}
