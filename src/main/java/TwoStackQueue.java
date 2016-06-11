import java.util.Stack;

/**
 * Created by wentian on 16/6/9.
 */
public class TwoStackQueue<T> {
    private Stack<T> pushStack = new Stack<T>();
    private Stack<T> popStack = new Stack<T>();

    public T add(T item){
        pushStack.push(item);
        return item;
    }

    public T poll(){
        if(popStack.empty()){
            moveStack();
        }

        if(!popStack.empty())
            return popStack.pop();

        return null;
    }

    public T peek(){
        if(popStack.empty()){
            moveStack();
        }

        if(!popStack.empty())
            return popStack.peek();

        return null;
    }

    private void moveStack(){
        int count = pushStack.size();
        for(int i=0; i<count; i++){
            T item = pushStack.pop();
            popStack.push(item);
        }
    }
}
