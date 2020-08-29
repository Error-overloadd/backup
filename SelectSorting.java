import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.text.DateFormat;
import javax.xml.crypto.Data;
public class SelectSorting {
    public static void main(String[] args) {
        //int arr[] = { 1, 19, 29, -100,-10,91,0,5,1,5,1 };
        int[]arr=new int[800000];
        for (int i = 0; i < 800000; i++) {
            arr[i]=(int)(Math.random()*800000);
        }

        Date data1=new Date();
        DateFormat a=new SimpleDateFormat("yyyy-dd HH:mm:ss");
        String deStr=a.format(data1);
        System.out.println("Time:"+ deStr);
        selectSorting(arr);
        //System.out.println(Arrays.toString(arr));
        Date data2=new Date();
        DateFormat a2=new SimpleDateFormat("yyyy-dd HH:mm:ss");
        String deStr1=a2.format(data2);
        System.out.println("Time:"+ deStr1);
    }

    public static void selectSorting(int[] arr) {
        
        for (int i = 0; i < arr.length-1; i++) {
            //int min=arr[i];
            int minIndex=i;     
            for (int j = 1+i; j < arr.length; j++) {
                if(arr[minIndex]>arr[j]){
                    minIndex=j;
                    

                }
            }
            if(minIndex!=i){
                int temp=arr[i];
                arr[i]=arr[minIndex];
                arr[minIndex]=temp;
            
            }
            
        }
    }
}
