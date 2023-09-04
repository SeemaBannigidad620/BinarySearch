public class MaxOfTwoDArray {

    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30},
                {67, 3},
                {9, 80, 6, 5}};
        int max = findMaxElementOfAnArray(arr);
        System.out.println("Maximum element of an array is " +max);
    }

    private static int findMaxElementOfAnArray(int[][] arr) {

//        int max = arr[0][0];
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                if (arr[row][col] > max) {
//                    max = arr[row][col];
//                }
//            }
//        }
//        return max;
//    }


        int max = arr[0][0];
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt > max) {
                    max = anInt;
                }
            }
        }
        return max;
    }
}
