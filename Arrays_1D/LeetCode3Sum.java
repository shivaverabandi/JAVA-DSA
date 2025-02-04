package Arrays_1D;
import java.util.*;

//https://leetcode.com/problems/3sum/

public class LeetCode3Sum{
     /*
    Brute Force Approach (O(N³))
    1. Check ALL possible triplets using 3 nested loops
    2. Use a Set to store unique triplets
    3. Sort each valid triplet before adding to Set to avoid duplicates
    4. Simple to understand but very slow for large inputs
    */
    public List<List<Integer>> threeSum1(int[] nums){ // Brute force --> O(N^3)
        int n = nums.length;
        List<List<Integer>> ans;
        Set<List<Integer>> set = new HashSet<>();
        for(int i = 0; i<n-2; i++){
            for(int j = i+1; j<n-1; j++){
                for(int k = j+1; k<n; k++){
                    int sum = nums[i] + nums[j] + nums[k];
                    if(sum == 0){
                        List<Integer> list = Arrays.asList(nums[i],nums[j],nums[k]);
                        list.sort(null);
                        set.add(list);
                    }
                }
            }
        }
        ans = new ArrayList<>(set);
        return ans;
    }
      /*
    Better Approach (O(N²) Time, O(N) Space)
    1. For each element, use a HashSet to track needed third value
    2. For pair (nums[i], nums[j]), look for -(nums[i]+nums[j]) in HashSet
    3. Sort valid triplets to avoid duplicates in Set
    4. Faster than brute force but still uses extra space for tracking
    */
    public List<List<Integer>> threeSum2(int[] nums){ // Better --> O(N^2)
        int n = nums.length;
        List<List<Integer>> ans;
        Set<List<Integer>> set = new HashSet<>();
        for(int i = 0; i<n-1; i++){
            HashSet<Integer> temp = new HashSet<>(); 
            for(int j = i+1; j<n; j++){
                int sum = -(nums[i] + nums[j]);
                if(temp.contains(sum)){
                    List<Integer> list = Arrays.asList(nums[i],nums[j],sum);
                    list.sort(null);
                    set.add(list);
                }
                temp.add(nums[j]); 
            }
        }
        ans = new ArrayList<>(set);
        return ans;
    }
    /*
    Optimized Two-Pointer Approach (O(N²) Time, O(1) Space)
    1. Sort array first to enable two-pointer technique
    2. For each element nums[i], find pairs (j,k) such that sum = 0
    3. Use left/right pointers (j starts at i+1, k at end)
    4. Skip duplicate elements to avoid repeated triplets
    5. Most efficient solution with no extra space for Sets
    */
    public List<List<Integer>> threeSum3(int[] nums) { // Optimized --> O(N^2) Two pointer Approach.
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        for(int i =0; i<n-2; i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int j = i+1;
            int k = n-1;
            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum > 0){k--;}
                else if(sum < 0){j++;}
                else{
                    List<Integer> list = Arrays.asList(nums[i],nums[j],nums[k]);
                    ans.add(list);
                    j++;
                    k--;
                    // to Avoid duplicate triplets
                    while(j<k && nums[j]==nums[j-1]) j++;
                    while(j<k && nums[k]==nums[k+1]) k--;
                }
            }
        }
        return ans;
    }
}
