import com.github.zhanyongzhi.interview.algorithm.stacklist.TwoStackQueue;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by wentian on 16/6/10.
 */
public class TwoStackQueueTest {
    @Test
    public void testPoll() throws Exception {
        TwoStackQueue<Integer> twoStackQueue = new TwoStackQueue<Integer>();

        twoStackQueue.add(1);
        twoStackQueue.add(2);
        twoStackQueue.add(3);

        Assert.assertEquals(twoStackQueue.poll().intValue(), 1);
        Assert.assertEquals(twoStackQueue.poll().intValue(), 2);
        Assert.assertEquals(twoStackQueue.poll().intValue(), 3);

        twoStackQueue.add(1);
        twoStackQueue.add(2);

        Assert.assertEquals(twoStackQueue.poll().intValue(), 1);

        twoStackQueue.add(3);
        Assert.assertEquals(twoStackQueue.poll().intValue(), 2);
        Assert.assertEquals(twoStackQueue.poll().intValue(), 3);
    }

    @Test
    public void testPeek(){
        TwoStackQueue<Integer> twoStackQueue = new TwoStackQueue<Integer>();

        twoStackQueue.add(1);
        twoStackQueue.add(2);
        twoStackQueue.add(3);

        Assert.assertEquals(twoStackQueue.peek().intValue(), 1);
    }
}