import com.github.zhanyongzhi.interview.algorithm.stacklist.Hannoi;
import org.junit.Test;

/**
 * Created by wentian on 16/6/11.
 */
public class HannoiTest {
    @Test
    public void startMove() throws Exception {
        Hannoi hannoi = new Hannoi();
        hannoi.startMove(2);
        System.out.println("-----------------------------------");
        hannoi.startMove(4);
    }

}