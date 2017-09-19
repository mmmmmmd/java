import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest {
    public static void main(String[] args){
        Collection books = new ArrayList();
        booksInit(books);
        booksClear(books);
        booksInit(books);
        booksPrint(books);
        booksLambdaPrint(books);
    }

    private static void booksLambdaPrint(Collection books) {
    }

    //集合遍历方法
    private static void booksPrint(Collection books) {
        Iterator iterator = books.iterator();               //获得Iterator迭代器
        while(iterator.hasNext()){
            String book = (String) iterator.next();
            System.out.println(book);
            if (book.equals("计算机网络")){
                iterator.remove();
                //在迭代器访问集合元素时不能直接对集合进行任何操作
                //如下代码会报错
                //books.remove(book);
            }
            book = "测试";
        }
        System.out.println(books);
    }

    //清理集合方法
    private static void booksClear(Collection books) {
        books.clear();
        System.out.println("集合清理完毕，清理后集合的大小为："+books.size());
    }

    //集合初始化方法
    private static void booksInit(Collection books) {
        books.add("java程序设计");
        books.add("计算机网络");
        books.add("计算机操作系统");
        System.out.println("集合初始化完成...集合大小为："+books.size());
    }
}
