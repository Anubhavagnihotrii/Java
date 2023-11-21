package basicprograms.validparentheses;
import java.util.Stack;
public class ValidParentheses {
    public static void main(String[] args) {
        String s = "(})[]{";
        char[] c=s.toCharArray();
//      System.out.println(Arrays.toString(c));
        Stack<Character> st = new Stack<>();

            for(Character x:c)
            {
                if( (!st.isEmpty()) && (  (st.peek()=='(' && x==')') || (st.peek()=='{' && x=='}') || (st.peek()=='[' && x==']')  )  )
                {
                    st.pop();
                }
                else
                {
                    st.push(x);
                }
            }
            System.out.println(st.isEmpty());
    }
}


