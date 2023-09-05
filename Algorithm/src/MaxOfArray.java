public class MaxOfArray {

    public static void main(String[] args) {
        int[] arr = {2,6, 9,10,5};
        int max = maxOfAnArray(arr);
        System.out.println("Maximum element of an array " + max);
    }

    private static int maxOfAnArray(int[] arr) {
        int max = arr[0];
        for(int i = 0; i< arr.length; i++){
            if(max > arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}
