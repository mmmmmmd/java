import java.util.ArrayDeque;
import java.util.Iterator;

/*
   Deque是Queue的子接口，它代表一个双端队列，Deque接口里定义了一些双端队列的方法
   Deque不仅仅可以作为双端队列使用也可以作为栈使用
 */
public class ArrayDequeTest {
    public static void main(String[] args){
        //作为双端队列使用
        ArrayDeque books = new ArrayDeque();
        books.add("白夜行");
        //将元素插入双端队列的队头
        books.addFirst("解忧杂货店");
        //将元素插入双端队列的队尾
        books.addLast("嫌疑人X的献身");
        System.out.println("双端队列中的元素有:"+books);
        //逆向遍历集合元素
        Iterator iterator = books.descendingIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("----------分割线----------");


        //作为栈使用
        ArrayDeque stack = new ArrayDeque();
        stack.push("Java");
        stack.push("Python");
        stack.push("C++");
        System.out.println("栈内元素为："+stack);

        System.out.println("栈顶元素为:"+stack.peek());
    }
}
