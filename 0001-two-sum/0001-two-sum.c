/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* twoSum(int* nums, int numsSize, int target, int* returnSize) {
    
    *returnSize = 2;

    for(int i = 0; i<numsSize; i++){
        for(int j = i+1; j<numsSize; j++){
            int sum = nums[i] + nums[j];
            if(sum == target){
                int* sai = (int*)malloc(2 * sizeof(int));
                sai[0] = i;
                sai[1] = j;
                return sai;
            }
        }
    }
    return NULL;
    
}