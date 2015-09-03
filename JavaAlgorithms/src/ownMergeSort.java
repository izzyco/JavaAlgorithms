import java.util.Arrays;

public class ownMergeSort {
	
	public static void mergeSort(int arr[]){
		mergeSort2(arr, 0, arr.length - 1);
	}
	
	public static void mergeSort2(int arr[], int start, int end){
		if(start < end){
			int midPoint = (start + end) / 2;
			mergeSort2(arr, start, midPoint);
			mergeSort2(arr, midPoint + 1, end);
			merge(arr, start, end);
		}
	}
	
	public static void merge(int arr[], int start, int end){
		int temp[] = arr.clone();
		int mid = (start + end) / 2;
		int i = start;
		int j = mid + 1;
		int k = start;
		while(i <= mid && j <= end){
			if(temp[j] < temp[i]){
				arr[k++] = temp[j++];
			}else{
				arr[k++] = temp[i++];
			}
		}
		
		while(i <= mid){
			arr[k++] = temp[i++];
		}
		
		while(j <= end){
			arr[k++] = temp[j++];
		}
	}
	
	public static void main(String args[]){
		int array[] = {4,3,10,22,32,1,32,9,0,92};
		//System.out.println(Arrays.toString(array));
		mergeSort(array);
		System.out.println(Arrays.toString(array));

	}
}
