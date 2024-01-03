import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {8, 20, -2, 4, -6};
        int[] sortedArr = mergeSort(arr);
        System.out.println(Arrays.toString(sortedArr));
    }

    public static int[] mergeSort(int[] arr) {
        if (arr.length < 2) {
            return arr;
        }

        int mid = arr.length / 2;
        int[] leftArr = Arrays.copyOfRange(arr, 0, mid);
        int[] rightArr = Arrays.copyOfRange(arr, mid, arr.length);

        return merge(mergeSort(leftArr), mergeSort(rightArr));
    }

    public static int[] merge(int[] leftArr, int[] rightArr) {
        int[] sortedArr = new int[leftArr.length + rightArr.length];
        int i = 0, j = 0, k = 0;

        while (i < leftArr.length && j < rightArr.length) {
            if (leftArr[i] <= rightArr[j]) {
                sortedArr[k++] = leftArr[i++];
            } else {
                sortedArr[k++] = rightArr[j++];
            }
        }

        while (i < leftArr.length) {
            sortedArr[k++] = leftArr[i++];
        }

        while (j < rightArr.length) {
            sortedArr[k++] = rightArr[j++];
        }

        return sortedArr;
    }
}
