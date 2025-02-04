package Arrays_1D;
import java.util.*;

//https://leetcode.com/problems/3sum/

public class LeetCode3Sum{
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
