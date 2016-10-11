package leetcode;

public class _136_singleNumer {
	public static int singleNumber(int[] nums){
		int res = 0;
		int l = nums.length;
		for(int i = 0; i< l; i++){
			res = res^nums[i];
		}
		return res;
	}
	public static void main(String args[]){
		int[] a1 = {1,1,2,2,3};
		int i1 = singleNumber(a1);
		System.out.println(i1);
	}
}
