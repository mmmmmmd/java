import java.util.Arrays;
import java.util.List;

/*
   Arrays工具类里提供了asList(Object... a)方法，该方法可以把一个数组或指定个数的对象转换成一个List集合
   这个List集合既不是ArrayList的实现类的实例，也不是Vector实现类的实例，而是Arrays的内部类ArrayList的实例

   Arrays.ArrayList是一个固定长度的List集合，程序只能遍历访问集合里的元素，不可增加、删除该集合里的元素。
 */
public class FixedListTest {
    public static void main(String[] args){
        List  fixedList = Arrays.asList("白夜行","嫌疑人X的献身","解忧杂货店");
        //获取fixedList的实现类
        System.out.println(fixedList.getClass());
        //使用方法遍历集合元素
        fixedList.forEach(System.out::println);
    }
}
