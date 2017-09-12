package test;
/*
 * creat by linux-zdy on 28-4-2017
 * java8改进的匿名内部类
 * java8之前匿名内部类访问的局部变量必须用final修饰
 * java8之后匿名内部类访问的局部变量相当于自动使用了final修饰
 */
interface A{
	void test();
}
public class ATest {
    public static void main(String[] args) {
		int age = 8;
		A a = new A(){
			public void test(){
				//此句如果放在java8之前的版本会报错，因为匿名内部类访问的
				//局部变量必须由final修饰，此处自动视为由final修饰的变量
				System.out.println(age);
			}
		};
		a.test();
	}
}
