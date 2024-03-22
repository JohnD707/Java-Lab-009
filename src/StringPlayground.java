public class StringPlayground {
    public static int countParentheses(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                count++;
            } else if (c == ')') {
                count--;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s1 = "((1 + 7) * 2)";
        String s2 = "((3 + 6) * 2))";
        String s3 = "((3 + 7) * 2";
        String s4 = "(4+4)(6)(2)";
        String s5 = "((4+4)))(((";

        System.out.println("s1: " + countParentheses(s1));
        System.out.println("s2: " + countParentheses(s2));
        System.out.println("s3: " + countParentheses(s3));
        System.out.println("s4: " + countParentheses(s4));
        System.out.println("s5: " + countParentheses(s5));
    }
}