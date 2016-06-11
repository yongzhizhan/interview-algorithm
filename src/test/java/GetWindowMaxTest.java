import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by wentian on 16/6/11.
 */
public class GetWindowMaxTest {
    @Test
    public void getWindowMax() throws Exception {
        Integer[] inputAry = new Integer[]{4,3,5,4,3,3,6,7};
        List<Integer> maxValueInWindowAry = new GetWindowMax().getWindowMax(inputAry, 3);

        Integer[] equalAray = new Integer[]{5,5,5,4,6,7};

        Integer[] resultAry = new Integer[maxValueInWindowAry.size()];
        maxValueInWindowAry.toArray(resultAry);

        Assert.assertArrayEquals(equalAray, resultAry);
    }

}