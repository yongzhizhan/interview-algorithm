package com.github.zhanyongzhi.interview.algorithm.stacklist;

import org.apache.commons.collections.iterators.ReverseListIterator;

import java.util.*;

/**
 * O(n)
 */
public class MaxTree {
    public void generateTree(List<Integer> valList){
        List<Integer> l2rList = getMaxList(valList, false);
        List<Integer> r2lList = getMaxList(valList, true);

        for(int i=0; i<valList.size(); i++){
            Integer leftVal = l2rList.get(i);
            Integer rightVal = r2lList.get(valList.size() - i - 1);

            String valPrint;
            if(null == leftVal && null == rightVal)
                valPrint = "no parent";
            else if(null == leftVal)
                valPrint = String.valueOf(rightVal);
            else if(null == rightVal)
                valPrint = String.valueOf(leftVal);
            else if(leftVal < rightVal)
                valPrint = String.valueOf(leftVal);
            else
                valPrint = String.valueOf(rightVal);

            System.out.println(String.format("val:%d, parent:%s", valList.get(i), valPrint));
        }
    }

    private List<Integer> getMaxList(List<Integer> valList, boolean reverse){
        //套路
        List<Integer> tMaxItemDeque = new LinkedList<>();
        Stack<Integer> tStackHelper = new Stack<>();

        Integer maxItem;

        Iterator<Integer> iter;
        if(reverse)
            iter = new ReverseListIterator(valList);
        else
            iter = valList.iterator();

        while (iter.hasNext()) {
            Integer item = iter.next();

            maxItem = null;

            while(false == tStackHelper.isEmpty()){
                Integer peekItem = tStackHelper.peek();
                if(peekItem > item)
                {
                    maxItem = peekItem;
                    tStackHelper.push(item);
                    break;
                }

                tStackHelper.pop();
            }

            if(tStackHelper.isEmpty()){
                tStackHelper.push(item);
            }

            tMaxItemDeque.add(maxItem);
        }

        return tMaxItemDeque;
    }
}
