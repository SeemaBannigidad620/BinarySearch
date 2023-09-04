public class LinearSearch {

    public static void main(String[] args) {
        int[] nums = {5, 10, 15, 20, 25};
        int target = 30;
        int element = linearSearch(nums, target);
        System.out.println("target is present in array" + element);
    }

    private static int linearSearch(int[] nums, int target) {

        if(nums.length == 0){
            return -1;
        }

        for(int i = 0; i< nums.length; i++){
            int elemnet = nums[i];
            if(elemnet == target){
                return i;
            }
        }
        return  -1;
    }
}
