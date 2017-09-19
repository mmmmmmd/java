/*
   HashSet的特点：
   1.按Hash算法来存储集合中的元素，因此具有良好的存取和查找性能
   2.不能保证元素的排列顺序，顺序可能与添加顺序不同，顺序也有可能发生变化
   3.HashSet不是同步的，如果多个线程同时访问一个HashSet，假设有两个或两个
     以上的线程同时修改了HashSet集合时，则必须通过代码来保证其同步
   4.集合元素值可以时null
   5.HashSet一般通过比较equal和hashcode方法的返回值来确定元素的存储，两个
     元素的equal和hashcode方法的返回值一致时才会取消改元素，如果随意改写
     方法则会引发性能上的下降问题。如果两个元素的equals方法返回值相同而hashcode
     方法返回值不同那么将认定为两个元素并分别存储在不同的存储单元里；如果两个元素
     的hashcode方法返回值相同而equals方法返回值不同那么将在一个存储单元里以链式
     存储，这将使hashset的查找效率下降
 */

public class HashSetTest {
    public static void main(String[] args){

    }
}
