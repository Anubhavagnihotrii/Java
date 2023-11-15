package basicprograms.stringanagram;

import java.util.Arrays;

public class StringAnagram {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        char[] c1 =s1.toCharArray();
        char[] c2 =s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        String sortedS1 = new String(c1);
        String sortedS2 = new String(c2);

        if(sortedS1.equals(sortedS2))
        {
            System.out.println("Given string s1 and s2 are anagrams");
        }
        else
        {
            System.out.println("Not a Anagram String");
        }

    }
}
