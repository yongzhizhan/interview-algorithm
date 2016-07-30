package com.github.zhanyongzhi.interview.algorithm.stacklist;

import org.junit.Test;

/**
 * test
 */
public class HannoiStackTest {
    @Test
    public void testDefault(){
        HannoiStack tHannoiStack = new HannoiStack();
        tHannoiStack.init(3);
        tHannoiStack.startMove();
    }
}