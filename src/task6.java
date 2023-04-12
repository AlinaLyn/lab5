public class task6 {
    public static void main(String[] args) {
        int[][] arr = new int[][]{new int[5], new int[5], new int[5], new int[5], new int[5], new int[8], new int[8], new int[8], new int[8], new int[3], new int[3], new int[3], new int[3], new int[9], new int[9], new int[9]};
        for (int i = 0; i < arr.length; ++i) {
            for ( i = 0; i < arr[i].length; ++i) {
                arr[i][i] = (int) (Math.random() * 16.0);
                System.out.println(arr[i][i] + "");

            }
            System.out.println("");
        }
    }
}
