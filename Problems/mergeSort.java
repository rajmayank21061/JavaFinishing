public class mergeSort {
    public static void Conquer(int arr[], int st,int mid,int lt){
        int mergarr[] = new int[lt - st + 1];
        int idx1 = st;
        int idx2 = mid + 1;
        int x = 0;
        while (idx1 <= mid && idx2 <= lt) {
            if( arr[idx1] < arr[idx2]){
                mergarr[x++] = arr[idx1++];
            } else {
                mergarr[x++] = arr[idx2++];
            }
        }
        while (idx1 <= mid) {
            mergarr[x++] = arr[idx1++];
        }
        while (idx2 <= mid) {
             mergarr[x++] = arr[idx2++];
        }
    for(int i = 0, j=st; i<mergarr.length; i++,j++){
        
        arr[j] = mergarr[i];
    }
    }

    public static void Divide(int arr[],int st,int lt){
        int mid = st + (lt - st)/2;
        
        if( st >= lt){
            return;
        }
        Divide(arr,st,mid);
        Divide(arr, mid+1, lt);
        Conquer(arr,st,mid,lt);
    }

    public static void main(String args[]) {
        int arr[] = {2,4,1,99,3,0};
        int n = arr.length;
        Divide(arr, 0, n-1);
        for(int i =0; i<arr.length; i++){
            System.out.println( arr[i] + " ");
        }
    }
}
