package hw2;

public class AdvancedArray5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {1,2,3,4};
		int [] b = {10,20,30,40};
		int  [] c = new int [a.length];
		for (int i = 0; i < a.length; i++) {
		c[i] = a[i] + b[i];
			System.out.print (c[i]+ " " );
		}
		

}

}