import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by wentian on 16/6/11.
 */
public class HannoiOneStepTest {
    @Test
    public void startMove() throws Exception {
        HannoiOneStep hannoiOneStep = new HannoiOneStep();
        hannoiOneStep.startMove(2);
    }

}