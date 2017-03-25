package com.github.zhanyongzhi.interview.algorithm.stacklist;

import java.util.Stack;

/**
 * 使用栈模拟汉诺塔移动,将towerA全部层移动到towerC
 * @author zhanyongzhi
 */
public class HannoiStack {
    private Stack<Integer> towerA = new Stack<>();
    private Stack<Integer> towerB = new Stack<>();
    private Stack<Integer> towerC = new Stack<>();

    private MoveType preMoveType = MoveType.LM;

    enum MoveType{
        LM("Move From Left to Middle"),
        MR("Move From Middle to Right"),
        RM("Move From Right to Middle"),
        ML("Move From Middle to Left");

        private final String name;

        MoveType(String s) {
            name = s;
        }

        public boolean equalsName(String otherName) {
            return (otherName == null) ? false : name.equals(otherName);
        }

        public String toString() {
            return name;
        }
    }

    public void init(int size){
        for(int i=size; 0 < i; i--){
            towerA.push(i);
        }
    }

    public void startMove(){
        int layerSize = towerA.size();

        while(layerSize != towerC.size()){
            moveStack(MoveType.LM, MoveType.ML, towerA, towerB);
            moveStack(MoveType.MR, MoveType.RM, towerB, towerC);
            moveStack(MoveType.RM, MoveType.MR, towerC, towerB);
            moveStack(MoveType.ML, MoveType.LM, towerB, towerA);
        }
    }

    private void moveStack(MoveType tryMove, MoveType preventMove, final Stack<Integer> towerFrom, final Stack<Integer> towerTo){
        if(preMoveType == preventMove)
            return;

        if(towerFrom.empty())
            return;

        Integer sElement = towerFrom.peek();

        if(!towerTo.empty()){
            Integer dElement = towerTo.peek();

            if(sElement > dElement)
                return;
        }

        preMoveType = tryMove;

        System.out.println(tryMove);
        towerFrom.pop();
        towerTo.push(sElement);
    }
}
