import java.util.LinkedHashSet;

/*
   1.LinkedHashSet也用HashCode来决定元素的存储位置
   2.用链表维护元素的次序
   3.需要维护元素的插入顺序
 */

public class LinkedHashTest {
    public static void main(String[] args){
        LinkedHashSet books = new LinkedHashSet();
        books.add("Android第一行代码");
        books.add("疯狂java讲义");
        books.add("计算机网络");
        books.add("解忧杂货店");
        System.out.println("集合初始化完毕，集合大小为："+books.size());
        System.out.println("集合内元素为："+books);
        books.remove("疯狂java讲义");
        System.out.println("集合目前内元素为："+books+"\n大小为："+books.size());
        books.add("疯狂java讲义");
        System.out.println("集合内元素为："+books+"\n大小为："+books.size());

    }
}
