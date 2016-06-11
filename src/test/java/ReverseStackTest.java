import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.*;

/**
 * Created by wentian on 16/6/10.
 */
public class ReverseStackTest {
    @Test
    public void reverseStack() throws Exception {
        ReverseStack<Integer> reverseStack = new ReverseStack<Integer>();

        Stack<Integer> stackData = new Stack<Integer>();
        stackData.push(1);
        stackData.push(2);
        stackData.push(3);

        reverseStack.reverseStack(stackData);

        while(!stackData.empty()){
            System.out.println(stackData.pop());
        }
    }
}