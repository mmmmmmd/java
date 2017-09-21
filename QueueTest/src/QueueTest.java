
/*
   Queue用于模拟队列这种数据结构，队列通常是先进先出（FIFO）的容器。队列的头部保存在队列中存放时间最长的元素，
   队列的尾部保存在队列中存放时间最短的元素。新元素插入（offer）到队列的尾部，访问元素（poll）操作会返回队列
   头部的元素。通常，队列不允许随机访问队列中的元素。

   Queue接口中定义的方法：
   1.void add(Object o):将指定元素加入此队列的尾部
   2.Object element():获取队列头部的元素，但是不删除该元素
   3.boolean offer(Object o):将指定元素插入该队列的尾部。当使用容量有限制的队列时，此方法通常比add()方法更好
   4.Object peek():获取队列头部的元素，但是不删除该元素，如果此队列为空则返回null
   5.Object poll():获取队列头部的元素，并删除该元素，如果此队列为空，则返回null
   6.Object remove():获取队列头部的元素并删除该元素

   Queue接口的PriorityQueue实现类
   Priority是一个相对标准的队列实现类。Priority保存队列元素的顺序并不是按加入队列的顺序，而是按队列元素的大小
   进行重新排序。因此当调用peek()方法或者poll()方法取出队列中的元素时，并不是取出最先进入队列的元素，而是取出
   队列中最小的元素。从这个意义上看，PriorityQueue已经违反了队列的最基本规则：先进先出(FIFO)
 */

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args){
        Queue num = new PriorityQueue();
        num.offer(-2);
        num.offer(0);
        num.offer(3);
        num.offer(5);

        //此时集合已经按由小到大排好序
        System.out.println("初始化后的集合元素为:"+num);
        System.out.println("集合内第一个元素为："+num.poll());
        System.out.println("获取了元素后集合内的元素为："+num);
    }
}
