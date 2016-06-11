import java.util.Stack;

/**
 * 每次移动只能移动一个柱子,不能跨柱子移动
 * erase time: 18:21.24
 */
public class HannoiOneStep {
    public void startMove(int count){
        move(count, "A", "B", "C");
    }

    private void move(int item, String from, String buffer, String to){
        //
        if(1 == item){
            System.out.println(String.format("move %d from %s to %s", item, from, buffer));
            System.out.println(String.format("move %d from %s to %s", item, buffer, to));
            return;
        }

        //general situation
        move(item - 1, from, buffer, to);
        System.out.println(String.format("move %d from %s to %s", item, from, buffer));
        move(item - 1, to, buffer, from);
        System.out.println(String.format("move %d from %s to %s", item, buffer, to));

        move(item - 1, from, buffer, to);
    }
}
