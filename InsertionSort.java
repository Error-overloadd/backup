import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args){
        int arr[] = { 1, 19, 29, -100 ,90,19,-5,-6};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int temp=arr[i];
            int inserIndex=i-1;
            while(inserIndex>=0 && temp<arr[inserIndex]){
                arr[inserIndex+1]=arr[inserIndex];
                inserIndex--;
            }
            arr[inserIndex+1]=temp;
            
        }
}
}