package com.github.zhanyongzhi.interview.algorithm.stacklist;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

public class MaxTreeTest {
    @Test
    public void generateTree() throws Exception {
        MaxTree maxTree = new MaxTree();
        List<Integer> valList = new LinkedList<>();
        valList.add(2);
        valList.add(3);
        valList.add(1);

        maxTree.generateTree(valList);
    }
}