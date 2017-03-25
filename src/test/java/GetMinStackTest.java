import com.github.zhanyongzhi.interview.algorithm.stacklist.GetMinStack;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by wentian on 16/6/9.
 */
public class GetMinStackTest {
    @Test
    public void getMin() throws Exception {
        GetMinStack<Integer> intStack = new GetMinStack<Integer>();

        intStack.push(11);
        intStack.push(12);
        intStack.push(13);

        Assert.assertEquals(intStack.getMin().intValue(), 11);

        intStack.pop();
        Assert.assertEquals(intStack.getMin().intValue(), 11);

        intStack.push(1);
        Assert.assertEquals(intStack.getMin().intValue(), 1);

        intStack.pop();
        Assert.assertEquals(intStack.getMin().intValue(), 11);
    }

}