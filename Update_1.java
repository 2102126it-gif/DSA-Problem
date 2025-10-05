import java.util.Arrays;

public class Update_1 {

    public static void update(int arr[], int newEle, int pos){
        arr[pos-1]=newEle;
    }

    public static void main(String as[]){
        int arr[] = new int[6];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;
        arr[5]=60;

        System.out.println(Arrays.toString(arr));

        update(arr,99,3);
        System.out.println(Arrays.toString(arr));
    }

}
