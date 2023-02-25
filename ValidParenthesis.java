public class validParen {

    //simple stack solution bea
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char a : s.toCharArray()) {
            if (a == '[' || a == '{' || a == '(') {
                stack.push(a);
                continue;
            }
            if (stack.empty()) {
                return false;
            }
            if (a == ']' && stack.pop() != '[') {
                return false;
            } else if (a ==')' && stack.pop() != '(') {
                return false;
            } else if (a =='}' && stack.pop() != '{') {
                return false;
            }
        }
        return stack.empty();
    }

    //using switch and case. 
    public static boolean isValidCase(String s) {
        Stack<Character> stack = new Stack<>();
        for (char a : s.toCharArray()) {
            System.out.println(a);
            switch (a) {
                case '[':
                case '(':
                case '{':
                    stack.push(a);
                    System.out.println(3);
                    break;
                case '}':
                    System.out.println(4);
                    if (stack.isEmpty() || stack.pop() != '{') {
                        return false;
                    }
                    break;
                case ')':
                    System.out.println(5);
                    if (stack.isEmpty() || stack.pop() != '(') {
                        return false;
                    }
                    break;
                case ']':
                    System.out.println(6);
                    if (stack.isEmpty() || stack.pop() != '[') {
                        return false;
                    }
                    break;
            }
        }
        System.out.println(stack);
        return stack.isEmpty();
    }


    public static void main(String[] args) {
        boolean yes = isValidCase("()");
        System.out.println(yes);
        
    }
}
