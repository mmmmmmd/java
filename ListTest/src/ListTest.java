import java.util.ArrayList;
import java.util.List;

/*
   List集合是有序集合，允许有重复元素，每个元素都有其对应的顺序索引
   List集合内常用方法：
   1.void add(int index,Object element):将元素element插入到集合的index处
   2.boolean addAll(int index,Collection c):将集合c所包含的所有元素插入到List集合的index处
   3.Object get(int Index):返回集合index索引处的元素
   4.int indexOf(Object o):返回对象o在List集合中第一次出现的索引
   5.int lastIndexOf(Object o):返回对象o在List集合中最后一次出现的索引
   6.Object remove(int index):删除集合中在index索引处的元素
   7.Object set(int index,Object element):将index索引处的元素替换成element对象，返回被替换的旧元素
   8.List subList(int fromIndex,int toIndex):返回集合中从fromIndex索引处到toIndex索引处的子集合
   9.void ReplaceAll(UnaryOperator operator):根据指定规则重新设置List集合内的所有元素
   10.void Sort(Comparator c):根据Comparator参数对List集合的元素排序

 */
public class ListTest {
    public static void main(String[] args){
        List books = new ArrayList();
        books.add("疯狂java讲义");
        books.add("Android第一行代码");
        books.add("解忧杂货店");
        books.add("Android第一行代码");
        //根据添加顺序排序
        System.out.println(books);
        //取第二个元素
        System.out.println("集合内第二个元素是："+books.get(1));
        //获得Android第一行代码在集合内第一次出现的索引，如果集合内没有则返回-1
        System.out.println("Android第一行代码在集合内第一次出现的索引是："+books.indexOf("Android第一行代码"));
        //获得Android第一行代码在集合内最后一次出现的索引
        System.out.println("Android第一行代码在集合内最后一次出现的索引是："+books.lastIndexOf("Android第一行代码"));

        List novel = new ArrayList();
        novel.add("白夜行");
        novel.add("嫌疑人X的献身");

        //将集合novel内的元素插入集合books的1索引处
        books.addAll(1,novel);
        System.out.println("添加后的集合元素为："+books);

        //将集合的最后一个元素替换成Android开发艺术探索
        books.set(books.size()-1,"Android开发艺术探索");

        System.out.println("修改后的集合元素为："+books);

        //截取集合内从2到5的子集合(左开右闭)
        System.out.println("所截取的子集合为"+books.subList(2,5));
    }
}
