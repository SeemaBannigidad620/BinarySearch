public class MaxWealth {

    public static void main(String[] args) {
        int[][] arr = {{1,2, 3},
                       {1, 2, 12}};
        int wealth = maximumWealth(arr);
        System.out.println("maximum wealth is " + wealth);
    }

    private static int maximumWealth(int[][] arr) {
        int rowSum = 0;
        int max = 0;
        for(int row = 0; row< arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                rowSum = rowSum + arr[row][col];
            }
            if (rowSum > max) {
                max = rowSum;
                rowSum =0;
            }
        }
      return max;
    }
}
