package test;
/*
 * creat by linux-zdy on 4-28-2017
 * 匿名内部类的测试
 * 匿名内部类可以继承一个父类或实现一个借口
 * 匿名内部类只能使用一次
 * 创建匿名内部类时会自动创建一个该类的实例，这个类定义立即消失
 * 匿名内部类不能自定义构造器：因为内部类没有类名
 */
interface Product{
	public double getPrice();
	public String getName();
}


public class AnonymousTest {
	public void test(Product p){
		System.out.println("购买了一个"+p.getName()+
				",花掉了"+p.getPrice()+"元");
	}
	public static void main(String [] argv){
		AnonymousTest ta = new AnonymousTest();
		ta.test(new Product(){
			public double getPrice(){
				return 567.8;
			}
			
			public String getName(){
				return "英伟达显卡";
			}
		});
	}

}
