import org.junit.Test;

import static org.junit.Assert.*;

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