import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class LearnInetAddress {

    public static InetAddress inet;

    public static void main(String[] args){
        testGetByAddress();
        testGetByName();
    }
    
    public static void testGetByAddress(){
        try {
            byte[] address = new byte[]{127,0,0,1};       //此处因为127<128所以不用强制转换为byte形式
            inet = InetAddress.getByAddress(address);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }finally {
            System.out.println(inet);
            try {
                System.out.println(inet.getLocalHost());
            } catch (UnknownHostException e) {
                e.printStackTrace();
            }
        }
    }
    
    public static void testGetByName(){
        InetAddress inetAddress;
        String hostName;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入主机名称：");
        hostName = sc.nextLine();
        try {
            inetAddress = InetAddress.getByName(hostName);
            System.out.println(inetAddress.getHostName());  //字符串形式的主机名
            System.out.println(inetAddress.getAddress());   //字节数组形式的ip地址
            System.out.println(inetAddress);                //主机名/域名
        }catch(UnknownHostException e){
            e.printStackTrace();
        }finally {
            return ;
        }
        
    }
}
