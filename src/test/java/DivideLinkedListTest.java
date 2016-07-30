import com.github.zhanyongzhi.interview.algorithm.stacklist.DivideLinkedList;
import com.github.zhanyongzhi.interview.algorithm.stacklist.Node;
import org.junit.Test;

/**
 * Created by wentian on 16/6/19.
 */
public class DivideLinkedListTest {
    @Test
    public void divideLinkedList() throws Exception {
        Node node1 = new Node(3);
        Node node2 = new Node(8);
        Node node3 = new Node(4);
        Node node4 = new Node(5);
        Node node5 = new Node(9);
        Node node6 = new Node(7);

        node1.setNext(node2).setNext(node3).setNext(node4).setNext(node5).setNext(node6);

        DivideLinkedList divideLinkedList = new DivideLinkedList();

        Node indexNode = divideLinkedList.divideLinkedList(node1, 8);
        while(null != indexNode){
            System.out.println("Node Value: " + indexNode.value);
            indexNode = indexNode.next;
        }

    }

}