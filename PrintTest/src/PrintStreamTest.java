import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/*
   使用处理流包装节点流可以提高效率并且操作便捷
 */
public class PrintStreamTest {
    public static void main(String[] args) {
        try(
                FileOutputStream fos = new FileOutputStream("temp.txt");
                PrintStream ps = new PrintStream(fos);
                ){
            ps.println("hello world");
            ps.println(new PrintStreamTest());
        }catch (IOException ioe){
                    ioe.printStackTrace();
        }
    }
}
