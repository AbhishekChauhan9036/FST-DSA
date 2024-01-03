public class QuickSort{
    public static void main(String[] args) {
        int arr[]={8,20,-2,4,-6};
        quickSort(arr);
        printArray(arr);
    }

    public static void quickSort(int arr[]){
        quickSortt(arr,0,arr.length-1);
    }

    public static void quickSortt(int arr[],int left,int right){
        if(left<right){
            int pivot=partition(arr,left,right);
            quickSortt(arr,left,pivot-1);
            quickSortt(arr,pivot+1,right);
        }
    }

    public static int partition(int arr[],int left,int right){
        int pivot=arr[right];
        int i=left;
        for(int j=left;j<right;j++){
            if(arr[j]<pivot){
                swap(arr,i,j);
                i++;
            }
        }
        swap(arr,i,right);
        return i;
    }

    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void printArray(int arr[]){
        for(int num:arr){
            System.out.print(num+" ");
        }
    }


}