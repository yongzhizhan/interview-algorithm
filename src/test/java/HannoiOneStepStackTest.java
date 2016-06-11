import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by wentian on 16/6/11.
 */
public class HannoiOneStepStackTest {
    @Test
    public void startMove() throws Exception {
        HannoiOneStepStack hannoiOneStepStack = new HannoiOneStepStack();
        hannoiOneStepStack.startMove(1);
    }

    @Test
    public void startMoveTwo() throws Exception {
        HannoiOneStepStack hannoiOneStepStack = new HannoiOneStepStack();
        hannoiOneStepStack.startMove(2);
    }
}