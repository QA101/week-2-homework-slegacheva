package hw2;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {1,2,3,4};
		swap(a, 0, 1 , 2, 3);
		// System.out.println(a[0] + " " + a[1]);
		 
		for (int i = 0; i <= 3; i++) {
			System.out.println ( "a[" + i + "]" + " = " + a[i]);
		
			 }
		}
	public static void swap(int[] list, int i, int j, int h, int r) {
		 int temp = list[i];
		 list[i] = list[r];
		 list[r] = temp;
		 list[j] = list[h];
		 list[h] = temp;
		 
		
		
	}
}

