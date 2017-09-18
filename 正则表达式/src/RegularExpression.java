import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[] args){

        first();        //初始匹配
        second();       //遍历存储的匹配结果


    }
    public static void first(){
        // Pattern对象可以复用的写法
        String str = "18658745693";
        Pattern p = Pattern.compile("186\\d{8}");       //以186开头的11位电话号码的正则匹配
        Matcher m = p.matcher(str);
        System.out.println(m.matches());

        //Pattern对象不能复用的写法
        boolean b = Pattern.matches("186\\d{8}",str);
        System.out.println(b);
    }

    public static void second(){
        String str = "我的电话是：18658696541"+
                "可以交个朋友，联系方式：13585475693"+
                "顺便出售二手手机，请联系：13789654125";
        //创建一个Pattern对象，并用他建立一个Matcher对象
        //这个正则表达式只用匹配186，135，137开头的11位手机号
        //实际要抓取哪些号码只用修改正则即可
        Matcher m = Pattern.compile("(186|135|137)\\d{8}").matcher(str);

        //遍历所得到的结果
        while(m.find()){
            System.out.println(m.group());
        }
    }
}
