package subject;

import structure.Stack;
import structure.impl.ResizeArrayStack;

public class A1_3_11 {
    static Double evaluatePostfix(String str){
        char[] chars = str.toCharArray();
        Stack<Double> numberStack=new ResizeArrayStack<>();
        for (char c : chars) {
            if (A1_3_10.number(c)){
                numberStack.push(Double.valueOf(c+""));
            }else if (A1_3_10.operation(c)){
                Double a = numberStack.pop();
                Double b = numberStack.pop();
                Double d=null;
                if ('+'==c){
                    d=a+b;
                }else if ('-'==c){
                    d=a-b;
                }else if ('*'==c){
                    d=a*b;
                }else if ('/'==c){
                    d=a/b;
                }
                numberStack.push(d);
            }
        }
        return numberStack.pop();
    }

    public static void main(String[] args) {
        System.out.println(evaluatePostfix("432/1-+"));
    }

}
