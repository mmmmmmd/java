package enumClass;
/*
 *  create by linux-zdy on 4-28-2017
 *  范例使用的枚举类
 *  一个源文件中只可以定义一个public访问权限修饰的枚举类
 *  java源文件名必须和public枚举类名相同
 *  与普通类的区别：
 *  可以实现一个或多个接口，默认继承java.lang.Enum类，无法显式继承其他类
 *  使用enum定义，非抽象的枚举类默认会用final修饰，枚举类不能派生子类
 *  枚举类的构造器只能用private修饰
 *  枚举类的所有实例必须在第一行显式列出，否则永远无法生成实例
 */
public enum SeasonEnum {
     SPRING,SUMMER,FALL,WINTER;
}
