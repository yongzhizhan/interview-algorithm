package com.github.zhanyongzhi.interview.algorithm.stacklist;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 使用栈来模拟汉诺塔的移动
 * 耗时:26:39.47
 */
public class HannoiOneStepStack {
    private Map<Integer, String> stackNameMap = new HashMap<Integer, String>();

    public void startMove(int count){
        Stack<Integer> A = new Stack<Integer>();
        Stack<Integer> B = new Stack<Integer>();
        Stack<Integer> C = new Stack<Integer>();

        stackNameMap.put(System.identityHashCode(A), "A");
        stackNameMap.put(System.identityHashCode(B), "B");
        stackNameMap.put(System.identityHashCode(C), "C");

        for(int i=count; i>0; i--){
            A.push(i);
        }

        moveByStack(A, A.size(), B, C);
    }

    private void moveByStack(Stack<Integer> A, int size, Stack<Integer> B, Stack<Integer> C){
        //
        if(1 == size){
            moveStackItem(A, B);
            moveStackItem(B, C);
            return;
        }

        moveByStack(A, size-1, B, C);
        moveStackItem(A, B);

        moveByStack(C, C.size(), B, A);
        moveStackItem(B, C);

        //再递归
        moveByStack(A, A.size(), B, C);
    }

    private void moveStackItem(Stack<Integer> stackFrom, Stack<Integer> stackTo){
        Integer item = stackFrom.pop();
        stackTo.push(item);

        System.out.println(String.format("move %d from %s to %s", item, stackNameMap.get(System.identityHashCode(stackFrom)), stackNameMap.get(System.identityHashCode(stackTo))));
    }
}
