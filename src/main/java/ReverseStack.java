import java.util.Stack;

/**
 * Created by wentian on 16/6/10.
 */
public class ReverseStack<T> {
    public Stack<T> reverseStack(Stack<T> stackData) {
        int size = stackData.size();
        T pushElement = null;
        for (int i = 0; i < size; i++) {
            pushElement = getAndPopBottomElement(stackData, i);
            stackData.push(pushElement);
        }

        return stackData;
    }

    public T getAndPopBottomElement(Stack<T> stackData, int index) {
        T bottom = stackData.pop();
        if (0 == index)
            return bottom;

        T result = getAndPopBottomElement(stackData, index - 1);
        stackData.push(bottom);
        return result;
    }
}
