package enumClass;
/*
 *  create by linux-zdy on 5-5 
 *  用于测试包含抽象方法的枚举类
 */

public enum Operation {
	//加法操作
	PLUS{
		public double eval(double x,double y){
			return x+y;
		}
	},
	
	//用于实现减法操作
    MINUS{
		public double eval(double x,double y){
			return x-y;
		}
	},
    
    //用于实现乘法操作
    TIMES{
		public double eval(double x,double y){
			return x*y;
		}
	},
	
	//用于实现除法操作
	DIVIDE{
		public double eval(double x,double y){
			return x/y;
		}
	};
	public abstract double eval(double x,double y);
	public static void main(String[] args) {
		System.out.println(Operation.PLUS.eval(5,4));
		System.out.println(Operation.MINUS.eval(5,4));
		System.out.println(Operation.TIMES.eval(5,4));
		System.out.println(Operation.DIVIDE.eval(5,4));
	}
}
