package subject;

import structure.Stack;
import structure.impl.FixedCapacityStack;

public class A1_3_4 {
    static boolean parentheses(String str){
        char[] chars = str.toCharArray();
        Stack<Character> stack=new FixedCapacityStack<>(chars.length);
        for (char c : chars) {
            if (c==')') {
                Character pop = stack.pop();
                if (!pop.equals('('))
                    return false;
            }else if (c=='}') {
                Character pop = stack.pop();
                if (!pop.equals('{'))
                    return false;
            }else if (c==']') {
                Character pop = stack.pop();
                if (!pop.equals('['))
                    return false;
            }else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }


}
