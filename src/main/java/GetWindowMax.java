import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * 获取各个窗口的最大值
 */
public class GetWindowMax {
    public List<Integer> getWindowMax(Integer[] input, int windowSize) {
        Deque<Integer> maxIndexQueue = new LinkedList<Integer>();
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {
            if(maxIndexQueue.isEmpty()) {
                maxIndexQueue.push(i);
                continue;
            }

            //移除过期的索引
            if(maxIndexQueue.peekFirst() + 3 <= i)
                maxIndexQueue.removeFirst();

            //当前如果是最大的数,则删除前面比其小的数字的索引,否则直接加到最后
            Integer lastElement = input[maxIndexQueue.peekLast()];
            Integer curElement = input[i];

            while(curElement >= lastElement){
                maxIndexQueue.removeLast();

                if(maxIndexQueue.isEmpty())
                    break;

                lastElement = input[maxIndexQueue.peekLast()];
            }

            maxIndexQueue.addLast(i);

            //索引未够window size,不需要获取最大值
            if(i < (windowSize - 1))
                continue;

            //最大值为开头的数字
            result.add(input[maxIndexQueue.peekFirst()]);
        }

        return result;
    }
}
