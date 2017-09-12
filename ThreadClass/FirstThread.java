package test;
/*
 * create by linux-zdy on 5-9-2017
 * 通过继承Thread类来创建进程
 */
public class FirstThread extends Thread{
	private int i;
	public void run(){
		for(;i<100;i++){
			//当线程继承自Thread类时，直接使用this即可获取当前线程
			//Thread对象的getName()可以返回当前进程的名字
			//因此可以直接调用getName()方法返回当前线程的名字
			System.out.println(getName() + " " + i);
		}
	}
	public static void main(String[] args) {
		for(int i=0;i<100;i++){
			//调用Thread类的currentThread静态方法获取当前线程
			System.out.println(Thread.currentThread().getName() + 
					" " + i);
			if(i == 20){
				new FirstThread().start();
				
				new FirstThread().start();
			}
		}
	}

}
