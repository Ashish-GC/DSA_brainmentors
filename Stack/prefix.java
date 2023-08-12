import java.util.Stack;

public class prefix {
    static void prefix(String s) {
        int n = s.length();
        char current;

        Stack<Integer> stack = new Stack<>();
        int ans=0;
        for (int i = n - 1; i >= 0; i--) {
            current = s.charAt(i);
            if (Character.isDigit(current)) {
                stack.push(Character.getNumericValue(current));
            } 
            else {
                  int num1 = stack.pop();
                  int num2 = stack.pop();
                switch (current) {
                    case '*': {
                        ans = num1 * num2;
                        break;
                    }
                    case '+': {
                        ans = num1 + num2;
                        break;
                    }
                    case '-': {
                        ans = num1 - num2;
                        break;
                    }
                    case '/': {
                        ans = num1 / num2;
                        break;
                    }
                    default: break;
                }
                stack.push(ans);
            }
        }
        System.out.println(stack.pop());
    }

    public static void main(String[] args) {
        String s = "*+123";
        prefix(s);
    }
}
