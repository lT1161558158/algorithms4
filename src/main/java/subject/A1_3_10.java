package subject;

import structure.Stack;
import structure.impl.ResizeArrayStack;

import java.util.HashSet;
import java.util.Set;

public class A1_3_10 {
    private static Set<Character> OPERATION=new HashSet<Character>(){{
        add('+');
        add('-');
        add('*');
        add('/');
    }};
    public static boolean operation(Character c){
        return OPERATION.contains(c);
    }
    public static boolean number(Character c){
        return c>='0' && c<='9';
    }

    /**
     *
     * @param str 中序表达式
     * @return 后序表达式
     */
    public static String infixToPostfix(String str){
        char[] chars = str.toCharArray();
        Stack<String> operationStack=new ResizeArrayStack<>();
        Stack<String> numberStack=new ResizeArrayStack<>();

        for (Character c : chars) {
            if (operation(c)){
                operationStack.push(c+"");
            }else if(number(c)){
                numberStack.push(c+"");
            }else if (c==')'){
                numberStack.push(numberStack.pop()+numberStack.pop()+operationStack.pop());
            }
        }
        return numberStack.pop();
    }

    public static void main(String[] args) {
        System.out.println(infixToPostfix("((1-(2/3))+4)"));
    }
}
