public class BinarySearch{
  public static void main(String[] args){
    /**
      二分查找算法：每次查找都是以序列中间位置的数与待查找的关键字进行比较，缩短一半的范围。
    */
    int[] arr = (1,3,5,7,9,11);
    int key = 4;
    int position = commonBinarySearch(arr,key);
    if(position == -1){
      System.out.println("查找的是" + key + "，序列中没有该数！");
    }else{
      System.out.println("查找的是" + key + "，找到位置为：" + position );
    }
  }
  /*
    定义二分算法类，确定一个有序整数数组中查找关键字所在的位置
  */
  public static int commonBinarySearch(int[] arr,int key){
    int low = 0;
    int high = arr.length - 1;
    int middle = 0;
    
    if(key < arr[low] || key > arr[high] || low > high){
      return -1;
    }
    
    while(low <= high){
        middle = (low + high) / 2;
        if(arr[middle] > key){
          high = middle - 1;
        }else if(arr[middle] < key){
          low = middle + 1;
        }else{
          return middle;
        }
    }    
    return -1;
  }
}
