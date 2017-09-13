import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;


//使用InetAddress类中的isReachable(int time)方法测试目标网络的连通性
public class IPScanner {

    private static InetAddress host;
    private static String address;

    public static void main(String [] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入ip地址：");
        address = sc.nextLine();
        if(isAddressAvailable(address))
            System.out.println("网络连通..目标主机开机");
        else
            System.out.println("网络故障..");
    }

    //测试单个网络是否连通的方法
    private static boolean isAddressAvailable(String address) throws IOException {
        try{
            host = InetAddress.getByName(address);
        }catch(UnknownHostException e){
            e.printStackTrace();
        }

        if(host.isReachable(2000))
            return true;
        else
            return false;
    }
}
