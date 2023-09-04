public class MinOfArray {

    public static void main(String[] args) {
        int[] arr = {10, 3, 5, 7, 8};
        int min = findMinOfAnArray(arr);
        System.out.println("minimum element in array is" + min);
    }

    private static int findMinOfAnArray(int[] arr) {
        int min = arr[0];
        for(int i = 1; i< arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
}
