public class QuickSort {

    public static int partition(int arr[], int s,int e) {
        int pivot = arr[s];
    int cnt = 0;
    for( int i = s+1; i<=e; i++)
    {
        if(arr[i]<=pivot)
        cnt++;
    }
    int pvt_ind = s + cnt;
    int temp = arr[pvt_ind];
        arr[pvt_ind] = arr[s];
        arr[s] = temp;
    int i = s,j=e;
    while(i<pvt_ind && j>pvt_ind){
        while(i<pvt_ind && arr[i]<=pivot){
            i++;
        }
        while(j>pvt_ind && arr[j]>pivot){
            j--;
        }
        if(i<pvt_ind && j>pvt_ind){
           int t = arr[i];
               arr[i] = arr[j];
               arr[j] = t;
               i++;
               j++;
        }
    }
    return pvt_ind;
}
public static void sortarray( int[] arr, int s , int e)
{
   if(s>=e){
    return;
   }
   // for partition
   int p = partition( arr,s,e);
   //rec relation
   //left part
   sortarray(arr,s,p-1);
   //right part
   sortarray(arr,p+1,e);
}
    public static void main(String[] args) {
        int arr[] = {9,2,8,7,6,5,1};
        int l = arr.length;
        sortarray(arr, 0, l-1);
        for(int i=0; i<l; i++){
            System.out.println(arr[i] + " ");
        }


    }
}
