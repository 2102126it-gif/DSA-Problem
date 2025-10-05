import java.util.Arrays;

public class Delete_1 {

    public static int linearSearch(int arr[],int ele){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==ele){
                return i;
            }
        }
        return -1;
    }

    public static void deleteAt(int arr[], int pos){
        int n=arr.length;
        int idx=pos-1;

        for(int i=idx;i<=n-2;i++){
            arr[i]=arr[i+1];
        }
        arr[n-1]=0;
    }

    public static void deleteEle(int arr[],int ele){
        int idx=linearSearch(arr,ele);
        if(idx!=-1)
            deleteAt(arr,idx+1);
    }

    public static void main(String as[]){
        int arr[]=new int[6];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;
        arr[5]=60;

        System.out.println(Arrays.toString(arr));

        deleteEle(arr,30);
        System.out.println(Arrays.toString(arr));

        deleteEle(arr,90);
        System.out.println(Arrays.toString(arr));

        deleteEle(arr,40);
        System.out.println(Arrays.toString(arr));
    }

}
