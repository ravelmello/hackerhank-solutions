/*
* Write a function that takes in a string of one or more words,
* and returns the same string, but with all five or more letter words
* reversed (Just like the name of this Kata). Strings passed in will
* consist of only letters and spaces.  Spaces will be included only
* when more than one word is present.
* */

import java.util.Arrays;
import java.util.stream.Collectors;

public class SpinWords {

    public static void main(String[] args) {

      System.out.println(SpinWords.spinWords("welcome"));
        System.out.println(SpinWords.spinWordsBetter("This is an apartment"));

    }

    static String spinWords(String s){
        String myArray[] = s.split(" ", s.length());
        StringBuilder stringBuilder = new StringBuilder();
        String sentence = "";

        for(int i = 0; i < myArray.length; i++){
            if(myArray[i].toString().length() >= 5) {
                StringBuilder inverted = new StringBuilder();
                inverted.append(myArray[i].toString());
                inverted.reverse();
                if(i!=0){stringBuilder.append(" ");
                }
                stringBuilder.append(inverted);
            } else {
                if(i!=0){stringBuilder.append(" ");
                }
                stringBuilder.append(myArray[i]);
            }
        }

        sentence = stringBuilder.toString();

        return sentence;

    }


    static String spinWordsBetter(String s){
        return Arrays.stream(s.split(" ")).map(
                x-> x.length() > 4 ? new StringBuilder(x).reverse().toString() : x).collect(Collectors.joining( " "));
    }

}
