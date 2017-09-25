import java.util.LinkedHashMap;
/*
   LinkedHashMap使用双向链表维护Map的迭代次序
 */
public class LinkedHashMapTest {
    public static void main(String[] args){
        LinkedHashMap books = new LinkedHashMap();
        books.put("疯狂Java讲义",109);
        books.put("Android第一行代码",60);
        books.put("鸟哥的Linux私房菜",90);
        books.forEach((key,value)->System.out.println(key+"--->"+value));
    }
}
