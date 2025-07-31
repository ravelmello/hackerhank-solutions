import java.util.HashMap;

public class SlidingWindow {

    public static void main(String[] args) {
        String str = "bcbbbcba";
        System.out.println(verifyMaxLenghtSubstr(str));
    }

    private static int verifyMaxLenghtSubstr(String str) {

        int r = 0;
        int l = 0;
        int max = 1;

        HashMap<Character, Integer> map = new HashMap<>();


        map.put(str.charAt(0), 1);

        while (r < str.length() - 1) {

            
            if(map.containsKey(str.charAt(r))) {
                map.put(str.charAt(r), map.getOrDefault(str.charAt(r), 0) + 1);
            } else {
                map.put(str.charAt(r), 1);
            }

            while (map.get(str.charAt(r)) == 3) {
                map.put(str.charAt(l), map.get(str.charAt(l)) - 1);
                l++;
            }
            max = Math.max(max, r - l +1);

        }


        return max;
    }
}
