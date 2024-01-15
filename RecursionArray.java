public class RecursionArray {

    public static int productOfArray(int arr[],int n){
        if(n==0){
            return 1;
        }else{
            return (arr[n]*productOfArray(arr, n-1));
        }
    }
    public static void main(String... args){
        int arr[]={1,2,3,4,5,6};
        int n=arr.length-1;
        System.out.println(productOfArray(arr,n));

    }
}
