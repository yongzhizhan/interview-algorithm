import java.util.Stack;

public class GetMinStack<T extends Comparable<T>> {
    Stack<T> stack;
    Stack<T> minElementStack;

    public GetMinStack(){
        stack = new Stack<T>();
        minElementStack = new Stack<T>();
    }

    public void push(T item) {
        stack.push(item);

        if(minElementStack.empty()) {
            minElementStack.push(item);
            return;
        }

        T topItem = getMin();

        if(0 <= item.compareTo(topItem))
            return;

        //当前加入的元素是最小的则加入到minElementStack中
        minElementStack.push(item);
    }

    public T pop(){
        T item = stack.pop();

        T topItem = getMin();

        //如果当前弹出的是最小的元素
        if(topItem.equals(item))
            minElementStack.pop();

        return item;
    }

    public T getMin(){
        return minElementStack.peek();
    }
}
