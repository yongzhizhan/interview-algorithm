import com.github.zhanyongzhi.interview.algorithm.stacklist.OrderStack;
import org.junit.Test;

import java.util.Stack;

/**
 * Created by wentian on 16/6/10.
 */
public class OrderStackTest {
    @Test
    public void orderStack() throws Exception {
        Stack<Integer> stackData = new Stack<Integer>();
        stackData.push(1);
        stackData.push(22);
        stackData.push(3);

        OrderStack<Integer> orderStack = new OrderStack<Integer>();
        Stack<Integer> resultStack = orderStack.orderStack(stackData);

        while (!resultStack.empty()) {
            System.out.println(resultStack.pop());
        }
    }
}