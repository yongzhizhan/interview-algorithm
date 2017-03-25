package com.github.zhanyongzhi.interview.algorithm.stacklist;

/**
 * 划分链表,对于给定的pivot,左边小于pivot,中间相等,右边大于pivot
 */

public class DivideLinkedList {
    public Node divideLinkedList(Node headerNode, Integer pivot){
        if(null == headerNode)
            return null;

        //遍历获取尾节点
        int len = 1;
        Node tailNode = headerNode;
        while(null != tailNode.next){
            tailNode = tailNode.next;
            len++;
        }

        //头尾相等
        if(tailNode == headerNode)
            return headerNode;

        //再次遍历,将大于pivot的数据放到tailer后面,小于的放到header前面
        Node indexNode = headerNode;
        Node prevNode = null;

        for(;0 != len; len--){
            Node curNode = indexNode;
            indexNode = indexNode.next;

            Integer value = curNode.value;
            if(value > pivot && tailNode != curNode){
                if(null == prevNode) {
                    headerNode = curNode.next;
                }else {
                    prevNode.next = curNode.next;
                }

                //成为新的尾部
                tailNode.next = curNode;
                curNode.next = null;

                tailNode = curNode;
                continue;
            }

            if(value < pivot && headerNode != curNode){
                //成为新的首部
                prevNode.next = curNode.next;
                curNode.next = headerNode;

                headerNode = curNode;
                continue;
            }

            prevNode = curNode;
        }

        return headerNode;
    }
}
