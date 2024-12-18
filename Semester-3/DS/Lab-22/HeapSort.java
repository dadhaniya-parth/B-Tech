// 98. Write a program to implement Heap Sort using Array.

public class HeapSort{ 
	
	static void heapSort(int[] arr){
		for(int i=arr.length/2-1; i>=0;i--){
			heapify(arr,arr.length,i);
		}
		for(int i=arr.length-1; i>0;i--){
			int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
			heapify(arr,i,0);
		}
	}
	
	static void heapify(int arr[],int n,int i){
		
		int maxIndex = i;
		int leftChild = 2*i+1;
		int rightChild = 2*i+2;

		if(leftChild<n && arr[leftChild]>arr[maxIndex]){
			maxIndex=leftChild;
		}

		if(rightChild<n && arr[rightChild]>arr[maxIndex]){
			maxIndex=rightChild;
		}

		if(i!=maxIndex){
			int temp = arr[maxIndex];
			arr[maxIndex] = arr[i];
			arr[i] = temp;
			heapify(arr,n,maxIndex);
		}

	}

	public static void main(String[] args) {
		int arr[] = {576,700,58,90,100,222,345,245};
		heapSort(arr);
		for (int i=0;i<arr.length;i++ ) {
			System.out.println(arr[i]);
		}
	}
}