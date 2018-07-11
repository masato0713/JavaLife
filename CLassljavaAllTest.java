package algorithm;

public class ClassAllTest {
	/*
	 * 将几种排序算法写成类里的方法:冒泡，选择，插入，快速，二分查找法。
	 */
	public static void main (String[] args) {
		//int[] arr = {3,6,2,5,1,7,9,8,4};
		/*测试冒泡排序法
		BubbleSort(arr);
		printArray(arr);
		*/
		/*测试选择排序法
		SelectionSort(arr);
		printArray(arr);
		*/
		/*测试插入排序法
		insertSort(arr);
		printArray(arr);
		*/
		/*
		 * 测试二分查找法（前提是数组是有序的）
		int[] arr = {1,4,6,8,9,45,63,206};
		System.out.print(binarySeek(arr,9));
		 */
		/*
		 * 测试快速排序法
		quickSort(arr,0,8);
		printArray(arr);
		 */
	}
	//数组输出方法
	public static void printArray(int[] arr){
		for (int i =0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	//冒泡排序法
	public static void BubbleSort(int[] arr){
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
	//选择排序法
	public static void SelectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;
			for (int j = minIndex + 1; j < arr.length; j++) {
				if (arr[minIndex] > arr[j]) {
					minIndex = j;
				}
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
	}
	//插入排序法
	public static void insertSort(int[] arr){
		for (int i = 1; i < arr.length; i++) {
			int j = i;
			int temp = arr[j];
			while (j > 0 && temp < arr[j - 1]) {
				arr[j] = arr[j - 1];
				j--;
			}
			arr[j] = temp;
		}
	}
	public static int binarySeek(int[] arr,int target){
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (target > arr[mid]) {
				//目标数位于中间数以右，起点变换成中间位并右移
				start = mid + 1;
			}else if (target < arr[mid]){
				//目标数位于中间数以左，终点变换成中间位置并左移
				end = mid -1;
			}else {
				return mid;
			}
		}
		return -1;
	}
	public static void quickSort(int[] arr, int s,int e){
		if (s >= e) {
			return;
		}
		int start = s;
		int end = e;
		int temp = arr[start];
		while (start < end) {
			while (start < end && arr[end] > temp) {
				end--;
			}
			if (start == end) {
				break;
			}
			arr[start] = arr[end];
			start++;
			while (start < end && arr[start] < temp) {
				start++;
			}
			if (start == end) {
				break;
			}
			arr[end] = arr[start];
			end--;
		}
		arr[start] = temp;
		quickSort(arr,s,start - 1);
		quickSort(arr,start + 1,e);
	}
}
