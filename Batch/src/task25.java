import java.util.Random;

public class task25 {

	public static void main(String[] args) {
		Random random = new Random();
		int[] intArray = new int[6];

		System.out.print("[");
		for(int i = 0; i < intArray.length; i++) {
			intArray[i] = random.nextInt(10);
			System.out.print(intArray[i]);
			if(i < intArray.length - 1) {
				System.out.print(",");
			}
		}
		System.out.println("]");

		int max = intArray[0];
		int min = intArray[0];
		for(int j = 0; j < intArray.length; j++) {
			if(max < intArray[j]) {
				max = intArray[j];
			}
			if(min > intArray[j]) {
				min = intArray[j];
			}
		}
		System.out.println("最大値: " + max);
		System.out.println("最小値: " + min);
	}

}
