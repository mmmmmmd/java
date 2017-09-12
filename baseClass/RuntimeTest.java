/*
 *  create by linux-zdy on 5-7-2017
 *  用于测试Runtime类
 *  Runtime类中的方法可以获取当前jvm的工作环境
 */
public class RuntimeTest {
	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		
		
		//这条语句用于测试Runtime类中的availableProcessors方法
		System.out.println("处理器数量：" + rt.availableProcessors());
		
		//这条语句用于测试Runtime类中freeMemory方法
		System.out.println("空闲内存：" + rt.freeMemory());
		
		//这条语句用于测试Runtime类中totalMemory方法
		System.out.println("总内存数：" + rt.totalMemory());
		
		//这条语句用于测试Runtime类中maxMemory方法
		System.out.println("可用最大内存数：" + rt.maxMemory());
	}

}
