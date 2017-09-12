

/*
 *  create by linux-zdy on 5-3-2017
 *  Lambda表达式的几种简化写法
 */
public class LambdaQs {
	public static void main(String[] args) {

		LambdaQs lq = new LambdaQs();
         
		lq.eat(()->System.out.println("苹果的味道还不错"));
		
		lq.drive(weather->{
			System.out.println("今天的天气是" + weather);
			System.out.println("直升飞机飞行平稳");
		});
		
		lq.test((a , b)->a + b);;
	}
	public void eat(Eatable e){
		System.out.println(e);
		e.taste();
	}
	
	public void drive(Flyable f){
		System.out.println("我正在驾驶：" + f);
		f.fly("【碧空如洗的晴日】");
	}
	
	public void test(Addable add){
		System.out.println("5与3的和为:" + add.add(5, 3));
	}

}

interface Eatable{
	void taste();
}


interface Flyable{
	void fly(String weather);
}


interface Addable{
	int add(int a,int b);
}

