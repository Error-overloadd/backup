//O(n^2) because there are two for loop

import java.util.Arrays;

public class BubbleSort {
    
    public static void main(String[] args){
        int arr[]={-5,-14,10,150,-89,-90,0,8,5,1,3,9};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
}
public static void bubbleSort(int[] arr){
    int temp=0;
    boolean flag=false;
    for (int i = 0; i < arr.length-1; i++) {
        for (int j = 0; j < arr.length-i-1; j++) {
            if(arr[j]>arr[j+1]){
                flag=true;
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;

            }
            
        }
        if(!flag){
            break;
        }
        else{
            flag=false;
            
        }
    }
}
}