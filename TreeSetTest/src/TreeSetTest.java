
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
   9.如果希望TreeSet正常工作那么应该向集合中添加同种类型元素
   10.TreeSet中轻易不要改变元素变量的成员变量
      如果修改那么将无法进行删除操作并且也无法删除和其值相等的元素，也不会重新对元素进行排序
      但是可以删除没有被修改且再集合内从没有重复值的元素
   11.定制排序：自然排序是根据数据的大小按升序排列
                定制排序是根据自定义的数据类型的某一属性进行排序
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

        TreeSet student = new TreeSet(((o1, o2) -> {
            Student student1 = (Student)o1;
            Student student2 = (Student)o2;
            return student1.age>student2.age?-1:student1.age<student2.age?1:0;
        }));
        student.add(new Student(15));
        student.add(new Student(16));
        student.add(new Student(17));
        student.add(new Student(18));
        customOrder(student);
    }

    //定制排序的方法
    public static void customOrder(TreeSet student){
        System.out.println(student);
    }

}
