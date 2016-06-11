/**
 * 汉诺塔移动过程打印
 */

public class Hannoi {
    /**
     * 开始移动
     * @param count 层数
     */
    public void startMove(int count){
        move(count, "A", "B", "C");
    }

    /**
     * 递归移动函数
     * @param item      当前移动的项
     * @param from      起始位置
     * @param buffer    缓存位置
     * @param to        目标位置
     */
    private void move(int item, String from, String buffer, String to){
        if(1 == item){
            System.out.println(String.format("move %d from:%s->%s", item, from, to));
            return;
        }else{
            move(item - 1, from, to, buffer);
            System.out.println(String.format("move %d from:%s->%s", item, from, to));

            //此时将buffer作为A柱来移动
            move(item - 1, buffer, from, to);
        }
    }
}
