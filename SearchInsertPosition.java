package com.array;

public class SearchInsertPosition {
	
	public static int searchInsert(int[] nums, int target) {
		
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }
        
        for(int i=0;i<nums.length-1;i++) {
        	for(int j=1;i<nums.length;j++) {
        		if(target>nums[i] && target<nums[j]){
                	System.out.println("*"+j);
                    return j;
        		}
            }
        }

        if(target>nums[nums.length-1]){
            return nums.length;
        }else{
            return 0;
        }
    }

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,10};
		System.out.println(searchInsert(a,8));
	}

}
