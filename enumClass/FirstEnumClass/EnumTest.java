package enumClass;
/*
 *  create by linux-zdy on 4-28-2017
 *  枚举类的相关测试
 */
public class EnumTest {
	public void judge(SeasonEnum s){
		//switch语句里的表达式可以是枚举值
		switch(s){
		case SPRING : System.out.println("春暖花开，正好踏青");break;
		case SUMMER : System.out.println("夏日炎炎，适合游泳");break;
		case FALL   : System.out.println("秋高气爽，进补及时");break;
		case WINTER : System.out.println("冬日雪飘，围炉赏雪");break;
		}
	}
	public static void main(String[] args) {
		//枚举类默认有一个values()方法,返回该枚举类的所有实例
		for(SeasonEnum s : SeasonEnum.values()){
			System.out.println(s.toString());
			//enum类的EnumClass.a.compareTo(EnumClass.b)方法可以用于比较a和b枚举类实例的顺序
			//返回结果为a的位置-b的位置
			//int ordinal()方法用于返回枚举类实例的索引值
			System.out.println(s.compareTo(SeasonEnum.FALL)+"\t"+s.ordinal());
		}
		//使用枚举类实例时可以使用EnumClass。variable形式来访问
		new EnumTest().judge(SeasonEnum.SPRING);
		
	}

}
