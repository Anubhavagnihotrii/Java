package basicprograms.reversingwordsinstring;

import java.util.StringJoiner;

public class RWinString {
        public static void main(String[] args) {
            String s = "   a good   example  ";
            String[] c= s.trim().split("\\s+");
            StringJoiner result= new StringJoiner(" ");
            for(int i=c.length-1;i>=0;i--)
            {
                result.add(c[i]);
            }
            System.out.println(result);
        }
}
