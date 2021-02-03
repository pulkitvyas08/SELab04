package SELab04;

public class BubbleSort {

	int arr[]= {123, 1, 4562, 6, 78, 34};
	
	public static void main(String[] args) {
		
		BubbleSort BSrt = new BubbleSort();
		for(int i=0; i<BSrt.arr.length - 1; i++) {
			for(int j=0; j<BSrt.arr.length - i - 1; j++) {
				if(BSrt.arr[j] > BSrt.arr[j + 1]) {
					int temp = BSrt.arr[j];
					BSrt.arr[j] = BSrt.arr[j + 1];
					BSrt.arr[j + 1] = temp;
				}
			}
		}
		for(int i=0; i<BSrt.arr.length; i++) {
			System.out.print(BSrt.arr[i] + " ");
		}
	}
}
