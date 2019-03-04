package subject;

import structure.Queue;
import structure.Stack;
import structure.impl.LinkedQueue;
import structure.impl.ResizeArrayStack;

public class A1_3_6 {
    public static void a136(){
        Queue<Integer> q=new LinkedQueue<>();
        for (int i = 0; i < 5; i++) {
            q.enqueue(i);
        }
        Stack<Integer> stack=new ResizeArrayStack<>();
        while (!q.isEmpty())
            stack.push(q.dequeue());
        while (!stack.isEmpty())
            q.enqueue(stack.pop());
        while (!q.isEmpty())
            System.out.println(q.dequeue());
    }

    public static void main(String[] args) {
        a136();
    }
}
