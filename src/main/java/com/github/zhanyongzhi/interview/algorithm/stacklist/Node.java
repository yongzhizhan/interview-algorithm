package com.github.zhanyongzhi.interview.algorithm.stacklist;

/**
 * 节点描述
 */
public class Node {
    public Node(Integer value){
        this.value = value;
        next = null;
    }

    public Node setNext(Node nextNode){
        next = nextNode;
        return nextNode;
    }

    public Integer value;
    public Node next;
}
