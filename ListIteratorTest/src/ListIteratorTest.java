import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*
   与Set只提供了一个iterator()方法不同，List还额外提供了一个listIterator()方法，该方法返回一个ListIterator对象，
   ListIterator接口继承了Iterator接口，提供了专门操作List的方法。ListIterator接口在Iterator接口基础上增加了如下方法：
   1.boolean hasPrevious():返回迭代器关联的集合是否还有上一个元素
   2.Object previous():返回迭代器的上一个元素
   3.void add(Object o):在指定位置添加一个元素

   Iterator与ListIterator的不同：
   ListIterator可以向前遍历，而Iterator只能向后遍历
   ListIterator可以用add()方法添加元素，而Iterator只能用remove()方法删除元素
 */
public class ListIteratorTest {
    public static void main(String[] args){
        String[] books = {"白夜行","嫌疑人X的献身","解忧杂货店"};
        List bookList = new ArrayList();
        for(int i = 0;i<books.length;i++){
            bookList.add(books[i]);
        }

        System.out.println("集合初始化完毕..");

        ListIterator listIterator = bookList.listIterator();

        //使用正向遍历
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
            listIterator.add("-----分隔符-----");
        }

        System.out.println("------以下为反向迭代-----");

        //使用反向遍历
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
    }
}
