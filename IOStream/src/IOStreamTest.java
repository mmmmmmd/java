import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOStreamTest {
    public static void main(String[] args) throws IOException{
        byte[] picture = new byte[4096];
        int hasRead;
        FileInputStream fileInputStream = new FileInputStream("D:\\JavaProject\\IOStream\\src\\example.png");
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\JavaProject\\IOStream\\src\\picture.png");
        while((hasRead = fileInputStream.read(picture))!=-1){
            fileOutputStream.write(picture,0,hasRead);
        }
        fileInputStream.close();
        fileOutputStream.close();
    }
}
