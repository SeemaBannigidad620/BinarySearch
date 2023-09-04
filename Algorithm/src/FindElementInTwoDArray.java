public class FindElementInTwoDArray {

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {2, 3},
                {4, 5, 6}};
        int target = 5;
        findAnElement(arr, target);
    }

    private static void findAnElement(int[][] arr, int target) {
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col< arr[row].length; col++){
                if(target == arr[row][col]){
                    System.out.println("element is present in 2d array " +arr[row][col]);
                }
            }
        }
    }
}