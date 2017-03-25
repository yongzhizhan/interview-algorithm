package com.github.zhanyongzhi.interview.algorithm.stacklist;

import java.util.Stack;

/**
 * Created by wentian on 16/6/10.
 */
public class OrderStack<T extends Comparable<T>> {
    public Stack orderStack(Stack<T> stackData) {
        Stack<T> helpStack = new Stack<T>();

        int size = stackData.size();
        for(int i=0; i<size; i++){
            T top = stackData.pop();

            while(!helpStack.empty() && helpStack.peek().compareTo(top) < 0){
                stackData.push(helpStack.pop());
            }

            helpStack.push(top);
        }

        while(!helpStack.empty())
            stackData.push(helpStack.pop());

        return stackData;
    }

    public Stack orderStack1(Stack<T> stackData) {
        if (null == stackData)
            return null;

        Stack<T> stackOrder = new Stack<T>();
        if (true == stackData.empty())
            return stackOrder;

        while(!stackData.empty()){
            T min = getAndPopMinElement2(stackData, stackOrder);
            stackOrder.push(min);
        }

        return stackOrder;
    }

    private T getAndPopMinElement2(Stack<T> stack, Stack<T> orderStack) {
        T min = null;
        int orderSize = orderStack.size();

        while (!stack.empty()) {
            T item = stack.pop();

            if (null == min)
                min = item;

            else if (0 < min.compareTo(item))
                min = item;

            orderStack.push(item);
        }

        while (orderStack.size() != orderSize) {
            T item = orderStack.pop();
            if(0 == min.compareTo(item))
                continue;

            stack.push(item);
        }

        return min;
    }
}
