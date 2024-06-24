package basicprograms.reversingWordsInPlace;

import java.util.Arrays;

public class ReversingWordsInPlace {
    public static void main(String[] args) {
        String s = "   anubhav is awesome !    ";
        String[] stringArray = s.trim().split(" ");
        System.out.println(Arrays.toString(stringArray));
        for (int i = 0; i < stringArray.length ; i++) {
            StringBuilder temp = new StringBuilder(stringArray[i]);
            stringArray[i]= String.valueOf(temp.reverse());
        }
        System.out.println(Arrays.toString(stringArray));
    }
}
