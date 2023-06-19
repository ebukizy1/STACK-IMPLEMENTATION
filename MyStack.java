package stack_Building;

import java.util.Stack;
import java.util.Vector;

public class MyStack<Any> {

    private Object[] myStack = new Object[5];
    private int size = 0;


    public boolean isEmpty() {
        if (size == 0) return true;
        return false;
    }

    public void push(Any input) {
        if (!isFull()) {
            myStack[size] = input;
            size++;
        } else throw new RuntimeException("stack is full");
    }

    public Any pop() {
        size--;
        Any value = (Any) myStack[size];
        return value;
    }

    public boolean isFull() {
        return (size == myStack.length);
    }

//    public Any peek() {
//        String value = "";
//        for (Object stacks : myStack)
//            if (size == 0);
//             return    pop();
//
//    }
}