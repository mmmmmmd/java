
import java.util.TreeSet;


/*
   TreeSet是SortSet的接口实现类，可以保证集合内元素有序
   TreeSet内的额外方法：
   1.Comparator comparator():如果TreeSet使用的是定制排序，那么该方法返回定制排序所使用的Comparator,如果使用自然排序那么返回null
   2.Object first():返回集合中的第一个元素
   3.Object last():返回集合中的最后一个元素
   4.Object lower(Object o):返回集合中位于指定元素之前的元素（即小于指定元素的最大元素，参考元素不需要是TreeSet里的元素）
   5.Object higher(Object o):返回集合中位于指定元素之后的元素~~
   6.SortSet SubSet(Object fromElement,Object toElement):返回此Set的子集合，集合左闭右开
   7.SortSet headSet(Object toElement):返回小于toElement的此Set集合的子集合
   8.SortSet tailSet(Object fromElement):返回大于或等于fromElement的此Set集合的子集合
 */

public class TreeSetTest {
    public static void main(String[] args){
        TreeSet num = new TreeSet();
        num.add(3);
        num.add(5);
        num.add(2);
        num.add(0);
        num.add(-5);
        //集合内元素已经由小到大排列好
        System.out.println(num);
        //输出集合内第一个元素
        System.out.println(num.first());
        //输出集合内最后一个元素
        System.out.println(num.last());
        //输出小于3的子集(不包含3)
        System.out.println(num.headSet(3));
        //输出大于等于3的子集
        System.out.println(num.tailSet(3));
        //输出大于等于0小于5的子集
        System.out.println(num.subSet(0,5));
    }
}
