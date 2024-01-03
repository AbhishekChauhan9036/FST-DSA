import java.util.*;

public class BinarySearch {

    public static int binarySearch(int arr[], int key) {
        int s = 0;
        int e = arr.length;
        while (s <= e) {
            int mid = (s + e) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        System.out.println(binarySearch(arr, key));
        sc.close();
    }
}
