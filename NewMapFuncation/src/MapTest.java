import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args){

        //集合初始化操作
        Map language = new HashMap();
        language.put("Java",4);
        language.put("Python",6);
        language.put("Shell",5);
        System.out.println("集合内的元素为:"+language);

        //将集合内的元素替换
        language.replace("Java",7);
        System.out.println("集合内的元素为:"+language);

        //使用新的参数对集合内的值进行替换
        language.merge("Java",5,(oldValue,newValue)->((Integer)oldValue+(Integer)newValue));
        System.out.println("集合内的元素为:"+language);

        //如果指定的key不存在时使用函数计算结果替代相应值
        language.computeIfAbsent("Ruby",(key)->((String)key).length());
        System.out.println("集合内的元素为:"+language);

        //如果指定的key存在时使用函数计算结果替代相应值
        language.computeIfPresent("Ruby",(key,value)->(Integer)value * (Integer)value);
        System.out.println("集合内的元素为:"+language);
    }
}
