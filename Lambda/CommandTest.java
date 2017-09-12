
public class CommandTest {
	public static void main(String[] args) {
		ProcessArray pa = new ProcessArray();
		int[] array = {5,2,3,1,-4};
		pa.process(array, (int [] target)->{
			int sum = 0;
			for(int temp:array){
				sum += temp;
			}
			System.out.println(sum);
		});
	}

}
