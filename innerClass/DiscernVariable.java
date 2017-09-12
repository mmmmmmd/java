package test;
/*
 *  create by linux-zdy on 4-27-2017
 *  测试内部类寻找变量的顺序
 *  最先在代码块的临时变量中找
 *  如果没有则在内部类的实例变量中找
 *  如果还没有就在外部类的实例变量中找 
 */
public class DiscernVariable {
	private String prop = "外部类实例变量";
	private class InClass{
		private String prop = "内部类实例变量";
		public void info(){
			String prop = "局部变量";
			System.out.println("外部类实例变量:"+DiscernVariable.this.prop);
			System.out.println("内部类实例变量:"+this.prop);
			System.out.println("局部变量:"+prop);
		}
	}
	public void test(){
		InClass ic = new InClass();
		ic.info();
	}
	public static void main(String [] argv){
		DiscernVariable dv = new DiscernVariable();
		dv.test();
	}

}
