package arrayShortUsingForloop;

import java.util.Iterator;

public class Test {
	
	public static void main(String[] args) {
		
		int temp = 0;
		
		int[] a = {3, 5, 17, 32, 10, 140, 200, 9, 23, 320, 400};
		
		for	(int i = 0; i < a.length; i++) {
			
			for (int j = i+1; j < a.length; j++) {
				
				if (a[i]>a[j]) {
					
					temp = a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
			System.out.println(a[i]);
		}
		
	}

}
