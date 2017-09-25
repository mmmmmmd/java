import java.util.HashMap;
import java.util.Map;



/*
   Map用于保存具有映射关系的数据，因此Map集合里保存着两组值，一组值用于保存Map里的Key
   另外一组值用于保存Map里的Value，key和value都可以是任何引用类型的数据。Map里的key不
   允许重复，，即同一个Map对象的任何两个key通过equals方法比较总是返回false
   key和value之间存在单向一对一关系，即通过指定的key只能找到唯一的、确定的value
 */


public class MapTest {
    public static void main(String[] args){


        //基本的添加元素操作
        Map books = new HashMap();
        books.put("解忧杂货店",35);
        books.put("嫌疑人X的献身",30);
        books.put("白夜行",40);
        System.out.println("图内的元素有："+books);

        //基本的检查操作
        System.out.println("集合中是否存在键是白夜行的元素："+books.containsKey("白夜行"));  //根据键来检验
        System.out.println("集合中是否存在值是30的元素："+books.containsValue(30));

        //基本的删除操作
        books.remove("白夜行");
        System.out.println("集合内的元素为："+books);
    }
}
