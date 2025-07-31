public class TwoPointers {

    public static void main(String[] args) {
        String text = "rac ecaR";
       System.out.println(reverseString(text));
    }

    public static String reverseString(String text) {

        StringBuilder resp = new StringBuilder();
        int len = text.length();
        int left = 0, right = 0;

        while (right < len) {
            if (text.charAt(right) != ' ') {
                right++;
            } else {
                resp.append(new StringBuilder(text.substring(left, right + 1)).reverse());
                right++;
                left = right;
            }
        }

        resp.append(' ');
        resp.append(new StringBuilder(text.substring(left)).reverse());



        return resp.substring(1);
    }
}
