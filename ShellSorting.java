import java.util.Arrays;

public class ShellSorting {

public static void main(String[] args){
    int arr[] = {9,2,1,0};
        //insertionSort(arr);
        shellsort(arr);
    System.out.println(Arrays.toString(arr));
}
public static void shellsort(int[] arr){
    for (int gap = arr.length; gap >0; gap/=2) {// first gap =4; 
        for (int i = gap; i < arr.length; i++) {
            int j=i;
            int temp=arr[j];
            //if(arr[j]<arr[j-gap]){
             
                while(j-gap>=0  && temp < arr[j-gap]){
                    int a=j-gap;    
                    arr[j]=arr[j-gap];
                        j-=gap;//while ends, shows that we find the address
                }
                arr[j]=temp;
            //}
        }
        
    }
}
}