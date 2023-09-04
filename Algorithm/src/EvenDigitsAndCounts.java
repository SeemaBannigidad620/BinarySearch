public class EvenDigitsAndCounts {

    public static void main(String[] args) {
        int[] arr = { 12, 345, 2, 6, 7896};
        for(int i = 0; i< arr.length; i++){
            if(arr[i]%2 == 0){
                int count = countDigits(arr[i]);
                System.out.println("count of numbers is " +count + " and number is " + arr[i]);
            }
        }
    }

    private static int countDigits(int i) {
        int count = 0;
        while ( i > 0){
            count++;
            i = i/10;
        }
        return count;
    }


}
