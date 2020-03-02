
public class task24 {

	public static void main(String[] args) {
		int[] array = new int[7];
		int a = 7;

		for(int i = 0; i < array.length; i++) {
			array[i] = a;
			a--;
		}

		for(int j = 0; j < array.length; j++) {
			System.out.print(array[j]);
			if(j < array.length - 1) {
				System.out.print(",");
			}
		}

		System.out.println();

		for(int k = array.length - 1; k >= 0; k--) {
			System.out.print(array[k]);
			if(k > 0) {
				System.out.print(",");
			}
		}
	}

}
