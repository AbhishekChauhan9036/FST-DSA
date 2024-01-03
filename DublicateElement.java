/*
Given an array of integers, find all the elements that appear more than once.
Input: [4, 3, 2, 7, 8, 2, 6, 1, 4]
Output: [2, 4]
Explanation: This problem is solved using a dictionary or a frequency counter 
to count the occurrences of each element.
4 - 2
3 - 1
2 - 2
7 - 1
8 - 1
6 - 1
4 - 1
*/
import java.util.*;
public class DublicateElement {
    public static List<Integer> findDuplicates(int[] nums) {
       List<Integer> result =new ArrayList<>();
       Set<Integer> seen =new HashSet<>();

       for(int num:nums){
        if(!seen.add(num)){
            result.add(num);
        }
       }
       return result;
       //O(N)
    }

    public static void main(String[] args) {
        int[] input = {4, 3, 2, 7, 8, 2, 6, 1, 4};
        List<Integer> duplicates = findDuplicates(input);
        System.out.println(duplicates);
    }
}
