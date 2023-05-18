public class PlayingBanjo {
    public static void main(String[] args) {

        System.out.println(PlayingBanjo.areYouPlayingBanjo("Ravel"));
        System.out.println(PlayingBanjo.areYouPlayingBanjo("Martin"));
    }


    static String areYouPlayingBanjo(String s){

        String response = "";

        if(s.startsWith("R") || s.startsWith("r") ){
            response = s + " plays banjo";
        } else {
            response = s + " does not play banjo";
        }

        return response;
    }
}
