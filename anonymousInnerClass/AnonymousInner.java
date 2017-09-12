package test;

/*
 * creat by linux-zdy on 4-28-2017
 * 当创建匿名内部类时必须实现借口或抽象父类里的所有抽象方法
 * 也可以重写父类里的普通方法
 */
abstract class Device{
	private String name;
	public abstract double getPrice();
	public Device(){}
	public Device(String name){
		this.name = name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
}
public class AnonymousInner {
    public void test(Device d){
		System.out.println("购买了一个"+d.getName()+
				",花掉了"+d.getPrice()+"元");
    }
    public static void main(String [] argv){
    	AnonymousInner ai = new AnonymousInner();
    	//使用带有一个参数的构造器
    	ai.test(new Device("电子示波器"){
    		public double getPrice(){
    			return 67.8;
    		}
    	});
    	
    	Device d = new Device(){
    		{
    			System.out.println("匿名内部类初始化块...");
    		}
    		//实现抽象方法
    		public double getPrice(){
    			return 56.2;
    		}
    		//重写父类的实例方法
    		public String getName(){
    			return "键盘";
    		}
    	};
    	ai.test(d);
    }
}

