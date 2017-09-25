import java.util.LinkedList;
import java.util.ListIterator;

/*
   LinkedList类是List接口的实现类，可以根据索引来随机访问集合中的元素
   LinkedList还实现了Deque接口，可以当作双端队列来使用
 */
public class LinkedListTest {
    public static void main(String[] args){
        LinkedList books = new LinkedList();

        
        books.add("白夜行");
        books.add("嫌疑人X的献身");
        books.add("解忧杂货店");
        System.out.println("集合中的元素为:"+books);

        //清空集合元素
        books.clear();

        //实现队列
        books.offer("白夜行");
        books.offer("嫌疑人X的献身");
        books.offerFirst("解忧杂货店");
        System.out.println("集合中的元素为:"+books);

        ListIterator iterator = books.listIterator();
        System.out.println("集合的正向迭代：");
        while(iterator.hasNext()){
            System.out.print(iterator.next()+"\t");
        }

        System.out.println("\n集合的逆向迭代：");
        while (iterator.hasPrevious()){
            System.out.print(iterator.previous()+"\t");
        }

        books.clear();


        //实现栈

        books.push("白夜行");
        books.push("嫌疑人X的献身");
        books.push("解忧杂货店" );

        System.out.println("\n集合内的元素为："+books);

    }
}
