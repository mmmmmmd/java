import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[] args){

        first();        //初始匹配

    }
    public static void first(){
        // Pattern对象可以复用的写法
        String str = "18629393495";
        Pattern p = Pattern.compile("186\\d{8}");       //以186开头的11位电话号码的正则匹配
        Matcher m = p.matcher(str);
        System.out.println(m.matches());

        //Pattern对象不能复用的写法
        boolean b = Pattern.matches("186\\d{8}",str);
        System.out.println(b);
    }
}
