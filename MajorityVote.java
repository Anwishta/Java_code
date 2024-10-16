import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class MajorityVote {
    // Function to find the majority elements in the array
    public static List<Integer> findMajority(List<Integer> nums) {
        List<Integer> majority = new ArrayList<>();
        int n = nums.size();

        if (n == 0) {
            majority.add(-1);
            return majority;
        }

        // Boyer-Moore Voting Algorithm initialization
        int candidate1 = 0, candidate2 = 0, count1 = 0, count2 = 0;

        // Step 1: Find the two majority candidates
        for (int num : nums) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        // Step 2: Validate the candidates
        count1 = 0;
        count2 = 0;

        for (int num : nums) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            }
        }

        if (count1 > n / 3) {
            majority.add(candidate1);
        }
        if (count2 > n / 3 && candidate2 != candidate1) { // Avoid duplicate entries
            majority.add(candidate2);
        }

        // Step 3: Handle the case when no majority elements exist
        if (majority.isEmpty()) {
            majority.add(-1);
        }

        return majority;
    }
    public static void main(String[] args) {
        List<Integer> nums1 = Arrays.asList(3, 3, 2);
        List<Integer> nums2 = Arrays.asList(3, 3, 2);
        List<Integer> nums3 = Arrays.asList(3, 3, 2);

        System.out.println("The majority element of array1 is: " +findMajority(nums1));
        System.out.println("The majority element of array2 is: " +findMajority(nums2));
        System.out.println("The majority element of array3 is: " +findMajority(nums3));
    }
}


