/**
  冒泡排序法
*/
public class Bubble{
  public static void main(String[] args){
    int[] arr = new int[]{6,4,7,3,1,8,9,2,5};
    for(int i = 1;i < arr.length;i++){
      for(int j = 1;j < arr.length - 1;j++){
        if(arr[j] < arr[j-1]){
          int temp = arr[j-1];
          arr[j-1] = arr[j];
          a[j] = temp; //较大的数
        }
      }
    }
  }
  for(int x = 0;x < arr.length;x++){
    System.out.print(arr[x]+"\t");
  }
}
