package test;
/*
 * create by linux-zdy on 5-9-2017
 * 通过继承Runnable接口创建线程执行类
 */
public class SecondThread implements Runnable{
	private int i;
	
	//run方法同样是线程执行体
	public void run(){
		for(;i<100;i++){
			//当线程类实现Runnable接口时
			//如果想获取当前线程，只能用Thread.currentThread()方法
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
	}
	
	public static void main(String[] args) {
		for(int i=0;i<100;i++){
			System.out.println(Thread.currentThread().getName() + " " + i);
			
			if(i == 20){
				//创建Runnable类的实现对象
				SecondThread st = new SecondThread();
				//Runnable类实现对象仅仅作为Thread()的target
				new Thread(st,"新线程1").start();;
				new Thread(st,"新线程2").start();
			}
		}
	}

}
