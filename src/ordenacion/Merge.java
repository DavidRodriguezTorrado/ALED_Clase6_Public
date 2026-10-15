package ordenacion;
import java.util.Arrays;
import java.util.Iterator;

public class Merge {

	
	public static int[] merge(int[] arr1, int[] arr2) {
		int[] res = new int[arr1.length + arr2.length];
		
		int pos1 = 0;
		int pos2 = 0;
		
		int posRes = 0;
		
		while (pos1 < arr1.length && pos2 < arr2.length) {
			if (arr1[pos1] <= arr2[pos2]) {
				res[posRes] = arr1[pos1];
				pos1++;
				posRes++;
			} else {
				res[posRes] = arr2[pos2];
				pos2++;
				posRes++;
			}
		}
		
		// Sólo falta 1 por recorrer... ¿cual?
		
		while(pos1 < arr1.length) {
			res[posRes] = arr1[pos1];
			pos1++;
			posRes++;
		}
		
		while(pos2 < arr2.length) {
			res[posRes] = arr2[pos2];
			pos2++;
			posRes++;
		}
		
		// res está lleno
		
		return res;
	}
	
	public static int[] dividirPrimeraMitad(int[] arr) {
		int[] res = new int[arr.length / 2];
		
		for (int i = 0; i < arr.length / 2; i++) {
			res[i] = arr[i];
		}
		return res;
	}
	
	public static int[] dividirSegundaMitad(int[] arr) {
		int[] res = new int[arr.length - (arr.length / 2)];
		int posRes = 0;
		
		for (int i = arr.length / 2; i < arr.length; i++) {
			res[posRes] = arr[i];
			posRes++;
		}
		return res;
	}
	
	public static int[] mergeSort(int[] arr) {
		if (arr.length <= 1) {
			return arr;
		}
		
		int[] izq = dividirPrimeraMitad(arr);
		int[] dch = dividirSegundaMitad(arr);
		
		izq = mergeSort(izq);
		dch = mergeSort(dch);
		
		return merge(izq, dch);
	}
	
	
	
	public static void main(String[] args) {
		// System.out.println(Arrays.toString(merge(new int[] {1, 3, 6, 8}, new int[] {2, 4, 5, 7})));
		System.out.println(Arrays.toString(mergeSort(new int[] {5, 2, 4, 3, 6, 1, 9, 7})));
	}
}
