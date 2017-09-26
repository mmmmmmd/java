import java.io.IOException;
import java.io.RandomAccessFile;

/*
   RandomAccessFile是java中提供的可以随机访问文件的类
   可以随机跳转到文件的任意位置进行读写
   最大的局限是只能读写文件，不能读写其他IO节点
 */
public class RandomAccessFileTest {
    public static void main(String[] args) throws IOException{
        RandomAccessFile raf = new RandomAccessFile("D:\\JavaProject\\RandomAccessFile\\src\\out.txt","rw");
        raf.seek(raf.length());
        raf.write("追加的数据".getBytes());
    }
}
