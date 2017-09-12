/*
 *create by linux-zdy on 4-27-2017
 *内部类的第一个实例
 */
public class Cow{
   private double weight;
   public Cow(){}
   public Cow(double weight){
      this.weight = weight;
   }
   private class cowLeg{
      private double length;
      private String color;
      public cowLeg(){}
      public cowLeg(double length,String color){
         this.length = length;
	 this.color = color;
      }
      public void info(){
         System.out.println("牛腿的颜色是:"+color+"长度是:"+length);
	 System.out.println("牛的体重是"+weight);
      }
      public void test(){
         cowLeg c1 = new cowLeg(1.12,"黑白相间");
	 c1.info();
      }
      public static void main(String [] args){
         Cow cow = new Cow(378.9);
	 cow.test();
      }
   }
}
