public class CamelCase {

    public static void main(String[] args) {
        System.out.println(converter("The_Stealth_Warrior"));
    }

    static String converter(String s){
        StringBuilder str = new StringBuilder();
        boolean noLetter = false;
        for(char ch: s.toCharArray()){
            if (Character.isLetter(ch)){
                if(noLetter == true){
                    str.append(Character.toUpperCase(ch));
                    noLetter = false;
                } else {
                    str.append(ch);
                }
            } else {
                noLetter = true;
            }
        }

        return str.toString();
    }
}
