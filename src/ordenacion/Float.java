package ordenacion;

public class Float {
	
	public static void main(String[] args) {
		float acumulado = 0;
		
		float[] arr = {2.5f, 3.5f};
		
		for (int i = 0; i < arr.length; i++) {
			acumulado += arr[i];
		}

		System.out.println(acumulado/arr.length);	
	}
}
